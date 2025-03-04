# Increase Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.increase.api/increase-java)](https://central.sonatype.com/artifact/com.increase.api/increase-java/0.194.0)

<!-- x-release-please-end -->

The Increase Java SDK provides convenient access to the Increase REST API from applications written in Java.

The Increase Java SDK is similar to the Increase Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

The REST API documentation can be found on [increase.com](https://increase.com/documentation).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.increase.api:increase-java:0.194.0")
```

### Maven

```xml
<dependency>
    <groupId>com.increase.api</groupId>
    <artifactId>increase-java</artifactId>
    <version>0.194.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;
import com.increase.api.models.Account;
import com.increase.api.models.AccountCreateParams;

// Configures using the `INCREASE_API_KEY` and `INCREASE_WEBHOOK_SECRET` environment variables
IncreaseClient client = IncreaseOkHttpClient.fromEnv();

AccountCreateParams params = AccountCreateParams.builder()
    .name("New Account!")
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build();
Account account = client.accounts().create(params);
```

## Client configuration

Configure the client using environment variables:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;

// Configures using the `INCREASE_API_KEY` and `INCREASE_WEBHOOK_SECRET` environment variables
IncreaseClient client = IncreaseOkHttpClient.fromEnv();
```

Or manually:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;

IncreaseClient client = IncreaseOkHttpClient.builder()
    .apiKey("My API Key")
    .build();
```

Or using a combination of the two approaches:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;

IncreaseClient client = IncreaseOkHttpClient.builder()
    // Configures using the `INCREASE_API_KEY` and `INCREASE_WEBHOOK_SECRET` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter          | Environment variable      | Required | Default value |
| --------------- | ------------------------- | -------- | ------------- |
| `apiKey`        | `INCREASE_API_KEY`        | true     | -             |
| `webhookSecret` | `INCREASE_WEBHOOK_SECRET` | false    | -             |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Increase API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.accounts().create(...)` should be called with an instance of `AccountCreateParams`, and it will return an instance of `Account`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;
import com.increase.api.models.Account;
import com.increase.api.models.AccountCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `INCREASE_API_KEY` and `INCREASE_WEBHOOK_SECRET` environment variables
IncreaseClient client = IncreaseOkHttpClient.fromEnv();

AccountCreateParams params = AccountCreateParams.builder()
    .name("New Account!")
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build();
CompletableFuture<Account> account = client.async().accounts().create(params);
```

Or create an asynchronous client from the beginning:

```java
import com.increase.api.client.IncreaseClientAsync;
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync;
import com.increase.api.models.Account;
import com.increase.api.models.AccountCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `INCREASE_API_KEY` and `INCREASE_WEBHOOK_SECRET` environment variables
IncreaseClientAsync client = IncreaseOkHttpClientAsync.fromEnv();

AccountCreateParams params = AccountCreateParams.builder()
    .name("New Account!")
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build();
CompletableFuture<Account> account = client.accounts().create(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.increase.api.core.http.Headers;
import com.increase.api.core.http.HttpResponseFor;
import com.increase.api.models.Account;
import com.increase.api.models.AccountCreateParams;

AccountCreateParams params = AccountCreateParams.builder()
    .name("New Account!")
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build();
HttpResponseFor<Account> account = client.accounts().withRawResponse().create(params);

int statusCode = account.statusCode();
Headers headers = account.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import com.increase.api.models.Account;

Account parsedAccount = account.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`IncreaseServiceException`](increase-java-core/src/main/kotlin/com/increase/api/errors/IncreaseServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                       |
  | ------ | ------------------------------- |
  | 400    | `BadRequestException`           |
  | 401    | `AuthenticationException`       |
  | 403    | `PermissionDeniedException`     |
  | 404    | `NotFoundException`             |
  | 422    | `UnprocessableEntityException`  |
  | 429    | `RateLimitException`            |
  | 5xx    | `InternalServerException`       |
  | others | `UnexpectedStatusCodeException` |

- [`IncreaseIoException`](increase-java-core/src/main/kotlin/com/increase/api/errors/IncreaseIoException.kt): I/O networking errors.

- [`IncreaseInvalidDataException`](increase-java-core/src/main/kotlin/com/increase/api/errors/IncreaseInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`IncreaseException`](increase-java-core/src/main/kotlin/com/increase/api/errors/IncreaseException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```java
import com.increase.api.models.Account;
import com.increase.api.models.AccountListPage;

// As an Iterable:
AccountListPage page = client.accounts().list(params);
for (Account account : page.autoPager()) {
    System.out.println(account);
};

// As a Stream:
client.accounts().list(params).autoPager().stream()
    .limit(50)
    .forEach(account -> System.out.println(account));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.accounts().list(params).autoPager()
    .forEach(account -> System.out.println(account), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
import com.increase.api.models.Account;
import com.increase.api.models.AccountListPage;

AccountListPage page = client.accounts().list(params);
while (page != null) {
    for (Account account : page.data()) {
        System.out.println(account);
    }

    page = page.getNextPage().orElse(null);
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `INCREASE_LOG` environment variable to `info`:

```sh
$ export INCREASE_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export INCREASE_LOG=debug
```

## Webhook Verification

We provide helper methods for verifying that a webhook request came from Increase, and not a malicious third party.

You can use `increase.webhooks().verifySignature(body, headers, secret?)` or `increase.webhooks().unwrap(body, headers, secret?)`,
both of which will raise an error if the signature is invalid. If secret is omitted, the body will be unwrapped without any validation.

Note that the "body" parameter must be the raw JSON string sent from the server (do not parse it first).
The `.unwrap()` method can parse this JSON for you.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;

IncreaseClient client = IncreaseOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.increase.api.models.Account;
import com.increase.api.models.AccountCreateParams;

Account account = client.accounts().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;
import java.time.Duration;

IncreaseClient client = IncreaseOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

IncreaseClient client = IncreaseOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### Environments

The SDK sends requests to the production by default. To send requests to a different environment, configure the client like so:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;

IncreaseClient client = IncreaseOkHttpClient.builder()
    .fromEnv()
    .sandbox()
    .build();
```

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.increase.api.core.JsonValue;
import com.increase.api.models.AccountCreateParams;

AccountCreateParams params = AccountCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods. You can also set undocumented parameters on nested headers, query params, or body classes using the `putAdditionalProperty` method. These properties can be accessed on the built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](increase-java-core/src/main/kotlin/com/increase/api/core/JsonValue.kt) object to its setter:

```java
import com.increase.api.core.JsonValue;
import com.increase.api.models.AccountCreateParams;

AccountCreateParams params = AccountCreateParams.builder()
    .name(JsonValue.from(42))
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.increase.api.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.accounts().create(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.increase.api.core.JsonField;
import java.util.Optional;

JsonField<String> name = client.accounts().create(params)._name();

if (name.isMissing()) {
  // The property is absent from the JSON response
} else if (name.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = name.asString();

  // Try to deserialize into a custom type
  MyClass myObject = name.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`IncreaseInvalidDataException`](increase-java-core/src/main/kotlin/com/increase/api/errors/IncreaseInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.increase.api.models.Account;

Account account = client.accounts().create(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.increase.api.models.Account;
import com.increase.api.models.AccountCreateParams;

Account account = client.accounts().create(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;

IncreaseClient client = IncreaseOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/Increase/increase-java/issues) with questions, bugs, or suggestions.
