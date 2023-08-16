# Changelog

## [0.8.4](https://github.com/Increase/increase-java/compare/v0.8.3...v0.8.4) (2023-08-16)


### Features

* default timeout is set for java clients ([#59](https://github.com/Increase/increase-java/issues/59)) ([a0bdd18](https://github.com/Increase/increase-java/commit/a0bdd18804c1c9d44f109dc281e34546d7026237))
* generate addXxx methods for array types ([#62](https://github.com/Increase/increase-java/issues/62)) ([031953c](https://github.com/Increase/increase-java/commit/031953c9a0ed7b66d5634b1fd76b944bd0f93431))


### Bug Fixes

* set correct timeouts on okhttp client ([#63](https://github.com/Increase/increase-java/issues/63)) ([f3a4a43](https://github.com/Increase/increase-java/commit/f3a4a43f66b7414e2d60355a87622a8d94be685e))


### Chores

* assign default reviewers to release PRs ([#61](https://github.com/Increase/increase-java/issues/61)) ([72257c0](https://github.com/Increase/increase-java/commit/72257c01116682051dafd14c096359340f6a1eeb))

## [0.8.3](https://github.com/Increase/increase-java/compare/v0.8.2...v0.8.3) (2023-08-11)


### Features

* **api:** updates ([#55](https://github.com/Increase/increase-java/issues/55)) ([314adae](https://github.com/Increase/increase-java/commit/314adae061640d5cdd4676126333fa695f2af612))


### Documentation

* **api:** change description of various fields ([#57](https://github.com/Increase/increase-java/issues/57)) ([7db1e95](https://github.com/Increase/increase-java/commit/7db1e95b2a91725abdd281ea2a3dd6c2d15b1ebc))

## [0.8.2](https://github.com/Increase/increase-java/compare/v0.8.1...v0.8.2) (2023-08-08)


### Features

* **api:** updates ([#52](https://github.com/Increase/increase-java/issues/52)) ([cf6fae1](https://github.com/Increase/increase-java/commit/cf6fae1c8358fb351cd63b2a682390a05dbc5f8c))
* **test:** unskip file uploads tests ([#46](https://github.com/Increase/increase-java/issues/46)) ([bf35772](https://github.com/Increase/increase-java/commit/bf35772430b75426d54380e0393eee100b3e843a))


### Chores

* **ci:** allow release to proceed without signing key id secret ([#53](https://github.com/Increase/increase-java/issues/53)) ([d1547d4](https://github.com/Increase/increase-java/commit/d1547d461391d48f906146844bc2809b372cabd9))
* **internal:** publish with --stacktrace for more helpful error information ([#49](https://github.com/Increase/increase-java/issues/49)) ([453732e](https://github.com/Increase/increase-java/commit/453732e00fc437c8ae221b7150f90b88d767ec29))
* **internal:** reorganize types ([#54](https://github.com/Increase/increase-java/issues/54)) ([055c963](https://github.com/Increase/increase-java/commit/055c9632783a249148df263ce879097c5d61718b))
* **internal:** support passing GPG_SIGNING_KEY_ID from secrets ([#51](https://github.com/Increase/increase-java/issues/51)) ([977a2be](https://github.com/Increase/increase-java/commit/977a2bebf053499adc17621bb39d64a0045d094c))

## [0.8.1](https://github.com/Increase/increase-java/compare/v0.8.0...v0.8.1) (2023-07-27)


### Features

* **ci:** add a publish-sonatype workflow for manual running ([#44](https://github.com/Increase/increase-java/issues/44)) ([fb2d0f4](https://github.com/Increase/increase-java/commit/fb2d0f4bd803d5f51026b3ec7a472de60aaa21da))


### Chores

* **internal:** add `codegen.log` to `.gitignore` ([#42](https://github.com/Increase/increase-java/issues/42)) ([09b95e6](https://github.com/Increase/increase-java/commit/09b95e6a217c58ea72eaa4b7487a457792c3e69e))

## [0.8.0](https://github.com/Increase/increase-java/compare/v0.7.1...v0.8.0) (2023-07-22)


### ⚠ BREAKING CHANGES

* **api:** reorganize `check_transfer` and `network fields; add `request_details`; add `unknown` ([#36](https://github.com/Increase/increase-java/issues/36))

### Features

* **api:** add fee_period_start and return_of_erroneous_or_reversing_debit ([#40](https://github.com/Increase/increase-java/issues/40)) ([c562272](https://github.com/Increase/increase-java/commit/c562272c8ee970444cce0f690ca90f83a7cce412))
* **api:** reorganize `check_transfer` and `network fields; add `request_details`; add `unknown` ([#36](https://github.com/Increase/increase-java/issues/36)) ([964c5ad](https://github.com/Increase/increase-java/commit/964c5adb2b91a1ce4a0e3b63542371a0e52923a2))


### Bug Fixes

* auto-close responses even if an exception is thrown during deserialization ([#38](https://github.com/Increase/increase-java/issues/38)) ([e8e9452](https://github.com/Increase/increase-java/commit/e8e94521a74091dcff02fcb01ef0e2f6a5b7636d))


### Documentation

* **api:** update `model_id` documentation ([#39](https://github.com/Increase/increase-java/issues/39)) ([29502ac](https://github.com/Increase/increase-java/commit/29502ac72de6f493b43891931cbc2c994352d8e8))

## [0.7.1](https://github.com/Increase/increase-java/compare/v0.7.0...v0.7.1) (2023-07-17)


### Features

* **api:** add physical_card_id ([#31](https://github.com/Increase/increase-java/issues/31)) ([1aef9ff](https://github.com/Increase/increase-java/commit/1aef9ff90998cde4b6341b42b6cc32abd8c756c6))


### Chores

* **internal:** minor reformatting ([#34](https://github.com/Increase/increase-java/issues/34)) ([f0a69b1](https://github.com/Increase/increase-java/commit/f0a69b1426d31d74e31849a86b858637c7ea8ee4))
* **internal:** minor reformatting + remove internal examples classes ([#33](https://github.com/Increase/increase-java/issues/33)) ([b656b3b](https://github.com/Increase/increase-java/commit/b656b3bd7259e7453baf1f9cd758b1d80c2f011c))

## [0.7.0](https://github.com/Increase/increase-java/compare/v0.6.0...v0.7.0) (2023-07-12)


### ⚠ BREAKING CHANGES

* **api:** add unique_identifier, driver's license backs, inbound funds holds, and more ([#28](https://github.com/Increase/increase-java/issues/28))

### Features

* **api:** add unique_identifier, driver's license backs, inbound funds holds, and more ([#28](https://github.com/Increase/increase-java/issues/28)) ([470fd38](https://github.com/Increase/increase-java/commit/470fd3802ad7b163c0c2bdc1a9f8a605d15ff8f4))

## [0.6.0](https://github.com/Increase/increase-java/compare/v0.5.0...v0.6.0) (2023-07-07)


### ⚠ BREAKING CHANGES

* **api:** add card profiles simulation method ([#25](https://github.com/Increase/increase-java/issues/25))

### Features

* **api:** add card profiles simulation method ([#25](https://github.com/Increase/increase-java/issues/25)) ([b7c7d75](https://github.com/Increase/increase-java/commit/b7c7d75ebbda9ef01eff6ebf60f950daeac01902))

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
