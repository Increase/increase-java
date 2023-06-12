# Changelog

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
