# Changelog

## [0.5.0](https://github.com/Increase/increase-java/compare/v0.4.1...v0.5.0) (2023-06-29)


### ⚠ BREAKING CHANGES

* **api:** remove many enum members from document category ([#22](https://github.com/Increase/increase-java/issues/22))

### Features

* **api/types:** mark more check transfer intention properties as nullable ([#21](https://github.com/Increase/increase-java/issues/21)) ([50e0bbc](https://github.com/Increase/increase-java/commit/50e0bbc45b50b431bdb3be9c3c964fb313189b49))


### Refactors

* **api:** remove `other` from reason enum ([#19](https://github.com/Increase/increase-java/issues/19)) ([3bb921d](https://github.com/Increase/increase-java/commit/3bb921db184c53d82227c5c3811714cfdc46964c))
* **api:** remove many enum members from document category ([#22](https://github.com/Increase/increase-java/issues/22)) ([327d529](https://github.com/Increase/increase-java/commit/327d5293471a4a48503636304812aa1497bc5ef6))


### Documentation

* add trailing newlines ([#23](https://github.com/Increase/increase-java/issues/23)) ([b553eec](https://github.com/Increase/increase-java/commit/b553eec4264af4ca9cd0b490bb662079635e7395))

## [0.4.1](https://github.com/Increase/increase-java/compare/v0.4.0...v0.4.1) (2023-06-19)


### Refactors

* **api:** remove unused properties and enum members ([#16](https://github.com/Increase/increase-java/issues/16)) ([4190d26](https://github.com/Increase/increase-java/commit/4190d26200176313ba4109b3f0a0236848ec5391))

## [0.4.0](https://github.com/Increase/increase-java/compare/v0.3.1...v0.4.0) (2023-06-13)


### ⚠ BREAKING CHANGES

* **api:** rename return reason enum member ([#13](https://github.com/Increase/increase-java/issues/13))

### Refactors

* **api:** rename return reason enum member ([#13](https://github.com/Increase/increase-java/issues/13)) ([22a3fd6](https://github.com/Increase/increase-java/commit/22a3fd63050eab68ff66c84b78968cbed97c8c93))


### Documentation

* point to github repo instead of email contact ([#14](https://github.com/Increase/increase-java/issues/14)) ([4ab211e](https://github.com/Increase/increase-java/commit/4ab211eef042fb09d11cafd25e1c0be5d7accb71))

## [0.3.1](https://github.com/Increase/increase-java/compare/v0.3.0...v0.3.1) (2023-06-12)


### Features

* **api:** add new endpoints + properties + enums ([#6](https://github.com/Increase/increase-java/issues/6)) ([5709621](https://github.com/Increase/increase-java/commit/5709621358606b76d7aeb14f650320a630894b7a))

## [0.3.0](https://github.com/Increase/increase-java/compare/v0.2.0...v0.3.0) (2023-05-31)


### ⚠ BREAKING CHANGES

* improve pagination response types

### Features

* add JsonValue.convert method ([27ed6d1](https://github.com/Increase/increase-java/commit/27ed6d19e8032fa61f5dcd015196305a8d91428b))
* **api:** add `at_time` property for balance lookups ([d75c450](https://github.com/Increase/increase-java/commit/d75c4508e912e2bb6f15b4ebfeea3ca2b95cbcf8))
* **api:** add `expires_at` property ([7d79522](https://github.com/Increase/increase-java/commit/7d79522da942328571c5071290d9019c409c2796))
* **core:** add `asUnknown` to `JsonField` ([91433f0](https://github.com/Increase/increase-java/commit/91433f0b9cfe341fb84cb7cfbb14d68ecec46362))
* **docs:** updates ([40bfd3e](https://github.com/Increase/increase-java/commit/40bfd3ec4c62b89b3f7766b5e24db9d3ddfa41d6))
* improve pagination response types ([7afbb7a](https://github.com/Increase/increase-java/commit/7afbb7afb610572890335ec5cfca10686525f08e))
* **tests:** support specifying `SKIP_MOCK_TESTS=true` ([840d385](https://github.com/Increase/increase-java/commit/840d385c9879ec2eef1c90281dd40959f4b4ab48))


### Refactors

* **pagination:** remove special casing of empty string cursors ([66d84c5](https://github.com/Increase/increase-java/commit/66d84c50e88a08d557ef18fc3c6ff76f7ea4dddf))
