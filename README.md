# Increase Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.increase.api/increase-java)](https://central.sonatype.com/artifact/com.increase.api/increase-java/0.425.0)
[![javadoc](https://javadoc.io/badge2/com.increase.api/increase-java/0.425.0/javadoc.svg)](https://javadoc.io/doc/com.increase.api/increase-java/0.425.0)

<!-- x-release-please-end -->

The Increase Java SDK provides convenient access to the [Increase REST API](https://increase.com/documentation) from applications written in Java.

The Increase Java SDK is similar to the Increase Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

<!-- x-release-please-start-version -->

The REST API documentation can be found on [increase.com](https://increase.com/documentation). Javadocs are available on [javadoc.io](https://javadoc.io/doc/com.increase.api/increase-java/0.425.0).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.increase.api:increase-java:0.425.0")
```

### Maven

```xml
<dependency>
  <groupId>com.increase.api</groupId>
  <artifactId>increase-java</artifactId>
  <version>0.425.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;
import com.increase.api.models.accounts.Account;
import com.increase.api.models.accounts.AccountCreateParams;

// Configures using the `increase.apiKey`, `increase.webhookSecret` and `increase.baseUrl` system properties
// Or configures using the `INCREASE_API_KEY`, `INCREASE_WEBHOOK_SECRET` and `INCREASE_BASE_URL` environment variables
IncreaseClient client = IncreaseOkHttpClient.fromEnv();

AccountCreateParams params = AccountCreateParams.builder()
    .name("New Account!")
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build();
Account account = client.accounts().create(params);
```

## Client configuration

Configure the client using system properties or environment variables:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;

// Configures using the `increase.apiKey`, `increase.webhookSecret` and `increase.baseUrl` system properties
// Or configures using the `INCREASE_API_KEY`, `INCREASE_WEBHOOK_SECRET` and `INCREASE_BASE_URL` environment variables
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
    // Configures using the `increase.apiKey`, `increase.webhookSecret` and `increase.baseUrl` system properties
    // Or configures using the `INCREASE_API_KEY`, `INCREASE_WEBHOOK_SECRET` and `INCREASE_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter          | System property          | Environment variable      | Required | Default value                |
| --------------- | ------------------------ | ------------------------- | -------- | ---------------------------- |
| `apiKey`        | `increase.apiKey`        | `INCREASE_API_KEY`        | true     | -                            |
| `webhookSecret` | `increase.webhookSecret` | `INCREASE_WEBHOOK_SECRET` | false    | -                            |
| `baseUrl`       | `increase.baseUrl`       | `INCREASE_BASE_URL`       | true     | `"https://api.increase.com"` |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```java
import com.increase.api.client.IncreaseClient;

IncreaseClient clientWithOptions = client.withOptions(optionsBuilder -> {
    optionsBuilder.baseUrl("https://example.com");
    optionsBuilder.maxRetries(42);
});
```

The `withOptions()` method does not affect the original client or service.

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
import com.increase.api.models.accounts.Account;
import com.increase.api.models.accounts.AccountCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `increase.apiKey`, `increase.webhookSecret` and `increase.baseUrl` system properties
// Or configures using the `INCREASE_API_KEY`, `INCREASE_WEBHOOK_SECRET` and `INCREASE_BASE_URL` environment variables
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
import com.increase.api.models.accounts.Account;
import com.increase.api.models.accounts.AccountCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `increase.apiKey`, `increase.webhookSecret` and `increase.baseUrl` system properties
// Or configures using the `INCREASE_API_KEY`, `INCREASE_WEBHOOK_SECRET` and `INCREASE_BASE_URL` environment variables
IncreaseClientAsync client = IncreaseOkHttpClientAsync.fromEnv();

AccountCreateParams params = AccountCreateParams.builder()
    .name("New Account!")
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build();
CompletableFuture<Account> account = client.accounts().create(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## File uploads

The SDK defines methods that accept files.

To upload a file, pass a [`Path`](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html):

```java
import com.increase.api.models.files.File;
import com.increase.api.models.files.FileCreateParams;
import java.nio.file.Paths;

FileCreateParams params = FileCreateParams.builder()
    .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
    .file(Paths.get("my/file.txt"))
    .build();
File file = client.files().create(params);
```

Or an arbitrary [`InputStream`](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html):

```java
import com.increase.api.models.files.File;
import com.increase.api.models.files.FileCreateParams;
import java.net.URL;

FileCreateParams params = FileCreateParams.builder()
    .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
    .file(new URL("https://example.com/my/file.txt").openStream())
    .build();
File file = client.files().create(params);
```

Or a `byte[]` array:

```java
import com.increase.api.models.files.File;
import com.increase.api.models.files.FileCreateParams;

FileCreateParams params = FileCreateParams.builder()
    .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
    .file("content".getBytes())
    .build();
File file = client.files().create(params);
```

Note that when passing a non-`Path` its filename is unknown so it will not be included in the request. To manually set a filename, pass a [`MultipartField`](increase-java-core/src/main/kotlin/com/increase/api/core/Values.kt):

```java
import com.increase.api.core.MultipartField;
import com.increase.api.models.files.File;
import com.increase.api.models.files.FileCreateParams;
import java.io.InputStream;
import java.net.URL;

FileCreateParams params = FileCreateParams.builder()
    .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
    .file(MultipartField.<InputStream>builder()
        .value(new URL("https://example.com/my/file.txt").openStream())
        .filename("my/file.txt")
        .build())
    .build();
File file = client.files().create(params);
```

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.increase.api.core.http.Headers;
import com.increase.api.core.http.HttpResponseFor;
import com.increase.api.models.accounts.Account;
import com.increase.api.models.accounts.AccountCreateParams;

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
import com.increase.api.models.accounts.Account;

Account parsedAccount = account.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`IncreaseServiceException`](increase-java-core/src/main/kotlin/com/increase/api/errors/IncreaseServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                      |
  | ------ | ------------------------------------------------------------------------------------------------------------------------------ |
  | 400    | [`BadRequestException`](increase-java-core/src/main/kotlin/com/increase/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](increase-java-core/src/main/kotlin/com/increase/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](increase-java-core/src/main/kotlin/com/increase/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](increase-java-core/src/main/kotlin/com/increase/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](increase-java-core/src/main/kotlin/com/increase/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](increase-java-core/src/main/kotlin/com/increase/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](increase-java-core/src/main/kotlin/com/increase/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](increase-java-core/src/main/kotlin/com/increase/api/errors/UnexpectedStatusCodeException.kt) |

- [`IncreaseIoException`](increase-java-core/src/main/kotlin/com/increase/api/errors/IncreaseIoException.kt): I/O networking errors.

- [`IncreaseRetryableException`](increase-java-core/src/main/kotlin/com/increase/api/errors/IncreaseRetryableException.kt): Generic error indicating a failure that could be retried by the client.

- [`IncreaseInvalidDataException`](increase-java-core/src/main/kotlin/com/increase/api/errors/IncreaseInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`IncreaseException`](increase-java-core/src/main/kotlin/com/increase/api/errors/IncreaseException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

The SDK defines methods that return a paginated lists of results. It provides convenient ways to access the results either one page at a time or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, use the `autoPager()` method, which automatically fetches more pages as needed.

When using the synchronous client, the method returns an [`Iterable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html)

```java
import com.increase.api.models.accounts.Account;
import com.increase.api.models.accounts.AccountListPage;

AccountListPage page = client.accounts().list();

// Process as an Iterable
for (Account account : page.autoPager()) {
    System.out.println(account);
}

// Process as a Stream
page.autoPager()
    .stream()
    .limit(50)
    .forEach(account -> System.out.println(account));
```

When using the asynchronous client, the method returns an [`AsyncStreamResponse`](increase-java-core/src/main/kotlin/com/increase/api/core/http/AsyncStreamResponse.kt):

```java
import com.increase.api.core.http.AsyncStreamResponse;
import com.increase.api.models.accounts.Account;
import com.increase.api.models.accounts.AccountListPageAsync;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

CompletableFuture<AccountListPageAsync> pageFuture = client.async().accounts().list();

pageFuture.thenRun(page -> page.autoPager().subscribe(account -> {
    System.out.println(account);
}));

// If you need to handle errors or completion of the stream
pageFuture.thenRun(page -> page.autoPager().subscribe(new AsyncStreamResponse.Handler<>() {
    @Override
    public void onNext(Account account) {
        System.out.println(account);
    }

    @Override
    public void onComplete(Optional<Throwable> error) {
        if (error.isPresent()) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(error.get());
        } else {
            System.out.println("No more!");
        }
    }
}));

// Or use futures
pageFuture.thenRun(page -> page.autoPager()
    .subscribe(account -> {
        System.out.println(account);
    })
    .onCompleteFuture()
    .whenComplete((unused, error) -> {
        if (error != null) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(error);
        } else {
            System.out.println("No more!");
        }
    }));
```

### Manual pagination

To access individual page items and manually request the next page, use the `items()`,
`hasNextPage()`, and `nextPage()` methods:

```java
import com.increase.api.models.accounts.Account;
import com.increase.api.models.accounts.AccountListPage;

AccountListPage page = client.accounts().list();
while (true) {
    for (Account account : page.items()) {
        System.out.println(account);
    }

    if (!page.hasNextPage()) {
        break;
    }

    page = page.nextPage();
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `INCREASE_LOG` environment variable to `info`:

```sh
export INCREASE_LOG=info
```

Or to `debug` for more verbose logging:

```sh
export INCREASE_LOG=debug
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `increase-java-core` is published with a [configuration file](increase-java-core/src/main/resources/META-INF/proguard/increase-java-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`IncreaseOkHttpClient`](increase-java-client-okhttp/src/main/kotlin/com/increase/api/client/okhttp/IncreaseOkHttpClient.kt) or [`IncreaseOkHttpClientAsync`](increase-java-client-okhttp/src/main/kotlin/com/increase/api/client/okhttp/IncreaseOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

Also note that there are bugs in older Jackson versions that can affect the SDK. We don't work around all Jackson bugs ([example](https://github.com/FasterXML/jackson-databind/issues/3240)) and expect users to upgrade Jackson for those instead.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

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
import com.increase.api.models.accounts.Account;

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

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```java
import com.increase.api.client.IncreaseClient;
import com.increase.api.client.okhttp.IncreaseOkHttpClient;

IncreaseClient client = IncreaseOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
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

### Custom HTTP client

The SDK consists of three artifacts:

- `increase-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`IncreaseClient`](increase-java-core/src/main/kotlin/com/increase/api/client/IncreaseClient.kt), [`IncreaseClientAsync`](increase-java-core/src/main/kotlin/com/increase/api/client/IncreaseClientAsync.kt), [`IncreaseClientImpl`](increase-java-core/src/main/kotlin/com/increase/api/client/IncreaseClientImpl.kt), and [`IncreaseClientAsyncImpl`](increase-java-core/src/main/kotlin/com/increase/api/client/IncreaseClientAsyncImpl.kt), all of which can work with any HTTP client
- `increase-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`IncreaseOkHttpClient`](increase-java-client-okhttp/src/main/kotlin/com/increase/api/client/okhttp/IncreaseOkHttpClient.kt) and [`IncreaseOkHttpClientAsync`](increase-java-client-okhttp/src/main/kotlin/com/increase/api/client/okhttp/IncreaseOkHttpClientAsync.kt), which provide a way to construct [`IncreaseClientImpl`](increase-java-core/src/main/kotlin/com/increase/api/client/IncreaseClientImpl.kt) and [`IncreaseClientAsyncImpl`](increase-java-core/src/main/kotlin/com/increase/api/client/IncreaseClientAsyncImpl.kt), respectively, using OkHttp
- `increase-java`
  - Depends on and exposes the APIs of both `increase-java-core` and `increase-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`increase-java` dependency](#installation) with `increase-java-core`
2. Copy `increase-java-client-okhttp`'s [`OkHttpClient`](increase-java-client-okhttp/src/main/kotlin/com/increase/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`IncreaseClientImpl`](increase-java-core/src/main/kotlin/com/increase/api/client/IncreaseClientImpl.kt) or [`IncreaseClientAsyncImpl`](increase-java-core/src/main/kotlin/com/increase/api/client/IncreaseClientAsyncImpl.kt), similarly to [`IncreaseOkHttpClient`](increase-java-client-okhttp/src/main/kotlin/com/increase/api/client/okhttp/IncreaseOkHttpClient.kt) or [`IncreaseOkHttpClientAsync`](increase-java-client-okhttp/src/main/kotlin/com/increase/api/client/okhttp/IncreaseOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`increase-java` dependency](#installation) with `increase-java-core`
2. Write a class that implements the [`HttpClient`](increase-java-core/src/main/kotlin/com/increase/api/core/http/HttpClient.kt) interface
3. Construct [`IncreaseClientImpl`](increase-java-core/src/main/kotlin/com/increase/api/client/IncreaseClientImpl.kt) or [`IncreaseClientAsyncImpl`](increase-java-core/src/main/kotlin/com/increase/api/client/IncreaseClientAsyncImpl.kt), similarly to [`IncreaseOkHttpClient`](increase-java-client-okhttp/src/main/kotlin/com/increase/api/client/okhttp/IncreaseOkHttpClient.kt) or [`IncreaseOkHttpClientAsync`](increase-java-client-okhttp/src/main/kotlin/com/increase/api/client/okhttp/IncreaseOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.increase.api.core.JsonValue;
import com.increase.api.models.accounts.AccountCreateParams;

AccountCreateParams params = AccountCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](increase-java-core/src/main/kotlin/com/increase/api/core/Values.kt) object to its setter:

```java
import com.increase.api.core.JsonValue;
import com.increase.api.models.accounts.AccountCreateParams;

AccountCreateParams params = AccountCreateParams.builder()
    .name(JsonValue.from(42))
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build();
```

The most straightforward way to create a [`JsonValue`](increase-java-core/src/main/kotlin/com/increase/api/core/Values.kt) is using its `from(...)` method:

```java
import com.increase.api.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](increase-java-core/src/main/kotlin/com/increase/api/core/Values.kt):

```java
import com.increase.api.core.JsonMissing;
import com.increase.api.models.accounts.AccountCreateParams;

AccountCreateParams params = AccountCreateParams.builder()
    .name(JsonMissing.of())
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
import com.increase.api.models.accounts.Account;

Account account = client.accounts().create(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.increase.api.models.accounts.Account;

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
