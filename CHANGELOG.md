# Changelog

## 0.0.1 (2024-02-15)

Full Changelog: [...abc-v0.0.1](https://github.com/Increase/increase-java/compare/...abc-v0.0.1)

### ⚠ BREAKING CHANGES

* **api:** split card profile resource into digital and physical card profile resources ([#178](https://github.com/Increase/increase-java/issues/178))
* fix oauth casing ([#163](https://github.com/Increase/increase-java/issues/163))
* **api:** remove Limits API, add ACH controls to Account Numbers   ([#84](https://github.com/Increase/increase-java/issues/84))
* **api:** change `physical_cards.status` value, remove `event_subscription` field, add fields ([#65](https://github.com/Increase/increase-java/issues/65))
* **api:** reorganize `check_transfer` and `network fields; add `request_details`; add `unknown` ([#36](https://github.com/Increase/increase-java/issues/36))
* **api:** add unique_identifier, driver's license backs, inbound funds holds, and more ([#28](https://github.com/Increase/increase-java/issues/28))
* **api:** add card profiles simulation method ([#25](https://github.com/Increase/increase-java/issues/25))
* **api:** remove many enum members from document category ([#22](https://github.com/Increase/increase-java/issues/22))
* **api:** rename return reason enum member ([#13](https://github.com/Increase/increase-java/issues/13))
* improve pagination response types
* rename nested params classes to use singular instead of plural
* rename At3dsCapableMerchant and FormSs4 with correct casing
* **api:** replace notification_of_change with a list, and add merchant_acceptor_id

### Features

* add async AutoPager implementation ([2c0c9d5](https://github.com/Increase/increase-java/commit/2c0c9d5971cb200e5dd164be4946209d4bd0e517))
* add async AutoPager implementation ([2c0c9d5](https://github.com/Increase/increase-java/commit/2c0c9d5971cb200e5dd164be4946209d4bd0e517))
* add JsonValue.convert method ([27ed6d1](https://github.com/Increase/increase-java/commit/27ed6d19e8032fa61f5dcd015196305a8d91428b))
* add methods to convert between sync and async clients ([94bc242](https://github.com/Increase/increase-java/commit/94bc242c2159ed60234508ba6c1d29708b53cc08))
* add support for proxies ([d44cac9](https://github.com/Increase/increase-java/commit/d44cac98a2222dec0b42c7f1e6aae33075f0da09))
* add support for proxies ([d44cac9](https://github.com/Increase/increase-java/commit/d44cac98a2222dec0b42c7f1e6aae33075f0da09))
* add timeout to RequestOptions ([f6b2b20](https://github.com/Increase/increase-java/commit/f6b2b200f616adfb1cd9ac1527730135ac87fce7))
* add timeout to RequestOptions ([539a358](https://github.com/Increase/increase-java/commit/539a3587ef8a459393c49f17a1e759286ca46cab))
* add timeout to RequestOptions ([539a358](https://github.com/Increase/increase-java/commit/539a3587ef8a459393c49f17a1e759286ca46cab))
* **api/types:** mark more check transfer intention properties as nullable ([#21](https://github.com/Increase/increase-java/issues/21)) ([50e0bbc](https://github.com/Increase/increase-java/commit/50e0bbc45b50b431bdb3be9c3c964fb313189b49))
* **api:** add `ach_debit_status` ([#147](https://github.com/Increase/increase-java/issues/147)) ([2433a8c](https://github.com/Increase/increase-java/commit/2433a8ce07fe1f1400958a6c2357cfd5690dc887))
* **api:** add `at_time` property for balance lookups ([d75c450](https://github.com/Increase/increase-java/commit/d75c4508e912e2bb6f15b4ebfeea3ca2b95cbcf8))
* **api:** add `collection_receivable` to transaction source category enum ([1d4e883](https://github.com/Increase/increase-java/commit/1d4e883f55f65df050bb49cbf9d69a82336dd540))
* **api:** add `expires_at` property ([7d79522](https://github.com/Increase/increase-java/commit/7d79522da942328571c5071290d9019c409c2796))
* **api:** add `simulations.check_transfers.return_()` method ([77ab17c](https://github.com/Increase/increase-java/commit/77ab17c522e3dc9b6dc5206fa5391f0697558e0a))
* **api:** add `simulations.check_transfers.return_()` method ([77ab17c](https://github.com/Increase/increase-java/commit/77ab17c522e3dc9b6dc5206fa5391f0697558e0a))
* **api:** add `suspected_fraud` rejection reason ([#139](https://github.com/Increase/increase-java/issues/139)) ([b467642](https://github.com/Increase/increase-java/commit/b467642dbf555814e62c0c6a975ad995a2943c94))
* **api:** add addenda details for ACH transfers ([#112](https://github.com/Increase/increase-java/issues/112)) ([71259fe](https://github.com/Increase/increase-java/commit/71259fef7b56d594b89b09b94f136242c17e9439))
* **api:** add bank_of_first_deposit_routing_number and transfer_id properties ([#80](https://github.com/Increase/increase-java/issues/80)) ([03cd0fb](https://github.com/Increase/increase-java/commit/03cd0fb25a91dc47e9f657c44ff229eb843ff57e))
* **api:** add bookkeeping accounts, entries, and entry sets, and several other changes ([274dd5e](https://github.com/Increase/increase-java/commit/274dd5ec3e3359054e13685519b1bbfc55ae8cd7))
* **api:** add card payment ID reference to transaction models ([#86](https://github.com/Increase/increase-java/issues/86)) ([96d1d8a](https://github.com/Increase/increase-java/commit/96d1d8a5d6739a1094ba66d88ce03aeaf1e3918d))
* **api:** add card payments endpoints ([#98](https://github.com/Increase/increase-java/issues/98)) ([6f26fcb](https://github.com/Increase/increase-java/commit/6f26fcb2e0cecea0330673ccd009d96a095cf328))
* **api:** add card profiles simulation method ([#25](https://github.com/Increase/increase-java/issues/25)) ([b7c7d75](https://github.com/Increase/increase-java/commit/b7c7d75ebbda9ef01eff6ebf60f950daeac01902))
* **api:** add deposit_submission property to check deposit ([#143](https://github.com/Increase/increase-java/issues/143)) ([3029b58](https://github.com/Increase/increase-java/commit/3029b58dddbe832aa4a7acf365b89d5049a863c1))
* **api:** add direction property to CardAuthorization ([#104](https://github.com/Increase/increase-java/issues/104)) ([aead744](https://github.com/Increase/increase-java/commit/aead744eba73fa291bac9fb702baa9aceddb5e0c))
* **api:** add entity_id to Card and make relationship nullable ([#91](https://github.com/Increase/increase-java/issues/91)) ([4f0869b](https://github.com/Increase/increase-java/commit/4f0869bb6a4f1e3d09af006a478f57c54e94f2f1))
* **api:** add failed to export status enum ([#129](https://github.com/Increase/increase-java/issues/129)) ([e954fc4](https://github.com/Increase/increase-java/commit/e954fc42d6bb2fb5947c2ca0aade0cc91a83d373))
* **api:** add fee_period_start and return_of_erroneous_or_reversing_debit ([#40](https://github.com/Increase/increase-java/issues/40)) ([c562272](https://github.com/Increase/increase-java/commit/c562272c8ee970444cce0f690ca90f83a7cce412))
* **api:** add fuel confirmation functionality ([#119](https://github.com/Increase/increase-java/issues/119)) ([dd6f31e](https://github.com/Increase/increase-java/commit/dd6f31e1fdb5ac6967f1f4af315604bd9ae34bf7))
* **api:** add inbound checks, originating routing number and new event types ([#94](https://github.com/Increase/increase-java/issues/94)) ([a1292d9](https://github.com/Increase/increase-java/commit/a1292d9a273e8414d46101dc2e67215b7e2c5be8))
* **api:** add merchant data to simulation api ([#157](https://github.com/Increase/increase-java/issues/157)) ([cc280ef](https://github.com/Increase/increase-java/commit/cc280efcfe73be70bf22754d20165c221b39c8d4))
* **api:** add network identifiers and effective date ([#125](https://github.com/Increase/increase-java/issues/125)) ([62ac2bc](https://github.com/Increase/increase-java/commit/62ac2bc7bd0a0f3ec3ecd83a839b8a84c5496c4e))
* **api:** add new endpoints + properties + enums ([#6](https://github.com/Increase/increase-java/issues/6)) ([5709621](https://github.com/Increase/increase-java/commit/5709621358606b76d7aeb14f650320a630894b7a))
* **api:** add new enum members ([619ef85](https://github.com/Increase/increase-java/commit/619ef8585b9c5d2ec5f331add0e23a11b1f32eab))
* **api:** add new fields ([a8f3517](https://github.com/Increase/increase-java/commit/a8f351748365e73b671edac4fda98f5d2222f0b2))
* **api:** add oauth token and inbound wire transfer methods ([#165](https://github.com/Increase/increase-java/issues/165)) ([f9d2eb9](https://github.com/Increase/increase-java/commit/f9d2eb98656f50b873348773aa4ba9e9d20435b0))
* **api:** add optional `pending_transaction_id` field to pending transaction ([34aa654](https://github.com/Increase/increase-java/commit/34aa654e6c21b653241a38842274d3047c224b85))
* **api:** add physical cards endpoints ([#96](https://github.com/Increase/increase-java/issues/96)) ([0495790](https://github.com/Increase/increase-java/commit/0495790d7d1da86789b491c43578ac8ec8821332))
* **api:** add physical_card_id ([#31](https://github.com/Increase/increase-java/issues/31)) ([1aef9ff](https://github.com/Increase/increase-java/commit/1aef9ff90998cde4b6341b42b6cc32abd8c756c6))
* **api:** add real-time payments request for payment endpoints ([#146](https://github.com/Increase/increase-java/issues/146)) ([28ea81f](https://github.com/Increase/increase-java/commit/28ea81f454ccf20766ff83b4616fe07d977e92a6))
* **api:** add returned_per_odfi_request enum ([#118](https://github.com/Increase/increase-java/issues/118)) ([321edba](https://github.com/Increase/increase-java/commit/321edba6733c49d6147fa094fb7bb1b2ed7b6d51))
* **api:** add unique_identifier, driver's license backs, inbound funds holds, and more ([#28](https://github.com/Increase/increase-java/issues/28)) ([470fd38](https://github.com/Increase/increase-java/commit/470fd3802ad7b163c0c2bdc1a9f8a605d15ff8f4))
* **api:** add Update Address  and Create Notification Change endpoints ([#82](https://github.com/Increase/increase-java/issues/82)) ([ba9a08b](https://github.com/Increase/increase-java/commit/ba9a08bba1d21cc294f390a4e6ba5adde78f070b))
* **api:** add wire decline object ([d673be3](https://github.com/Increase/increase-java/commit/d673be3b8e7241e148541b2b2f73fa6262a9ba85))
* **api:** allow webhook unwrapping without providing secret ([#153](https://github.com/Increase/increase-java/issues/153)) ([5581b62](https://github.com/Increase/increase-java/commit/5581b626fb924129fb18e01e6902a258a2c60c8e))
* **api:** change `physical_cards.status` value, remove `event_subscription` field, add fields ([#65](https://github.com/Increase/increase-java/issues/65)) ([5b2c460](https://github.com/Increase/increase-java/commit/5b2c46083e373868e2dc8bc04577e2448444c191))
* **api:** enum updates ([8979660](https://github.com/Increase/increase-java/commit/89796601149d7a1f11701c3d2d3023674f4c15ee))
* **api:** expand event categories and Entity status options ([#102](https://github.com/Increase/increase-java/issues/102)) ([5635054](https://github.com/Increase/increase-java/commit/56350547b1d780e6232b9b020ec66342bd58ea6f))
* **api:** export account statements in OFX format ([#93](https://github.com/Increase/increase-java/issues/93)) ([3de7035](https://github.com/Increase/increase-java/commit/3de7035a8b7809c34588661c4b61f525e2f7a8fb))
* **api:** list Inbound Wire Transfers, change transfer simulation return types ([#168](https://github.com/Increase/increase-java/issues/168)) ([b3c3011](https://github.com/Increase/increase-java/commit/b3c30110100ee9c17ab2c4fab85c24afcc5e66a1))
* **api:** make routeType an enum & add ACHTransfer.effectiveDate ([03b10c4](https://github.com/Increase/increase-java/commit/03b10c479a822ee2250e5b1e0b7c56286578ebc0))
* **api:** make routeType an enum & add ACHTransfer.effectiveDate ([03b10c4](https://github.com/Increase/increase-java/commit/03b10c479a822ee2250e5b1e0b7c56286578ebc0))
* **api:** move inbound ACH transfer returns (⚠️ breaking); add ACH transfer declines ([#72](https://github.com/Increase/increase-java/issues/72)) ([162f32f](https://github.com/Increase/increase-java/commit/162f32f3fe6dbc318fc9180bafa80d2a9f9944e7))
* **api:** new methods for handling webhooks ([#152](https://github.com/Increase/increase-java/issues/152)) ([7c091ec](https://github.com/Increase/increase-java/commit/7c091ecbecdabb2d689699a4bc3980c4ef41a619))
* **api:** remove cardSettlementTransactionId ([f3e1ed0](https://github.com/Increase/increase-java/commit/f3e1ed055f4e39eae4974f70c375f2579004bf57))
* **api:** remove Limits API, add ACH controls to Account Numbers   ([#84](https://github.com/Increase/increase-java/issues/84)) ([d8f243a](https://github.com/Increase/increase-java/commit/d8f243ad081de3629c48529bb8465638344cb929))
* **api:** remove unused `/inbound_ach_transfer_returns` endpoints ([#78](https://github.com/Increase/increase-java/issues/78)) ([fa61641](https://github.com/Increase/increase-java/commit/fa61641d1435cb1f77f2c187baacd7a1570e72f8))
* **api:** reorganize `check_transfer` and `network fields; add `request_details`; add `unknown` ([#36](https://github.com/Increase/increase-java/issues/36)) ([964c5ad](https://github.com/Increase/increase-java/commit/964c5adb2b91a1ce4a0e3b63542371a0e52923a2))
* **api:** replace notification_of_change with a list, and add merchant_acceptor_id ([d070446](https://github.com/Increase/increase-java/commit/d070446013bc2edeca2e4410581c069c8c5fd5eb))
* **api:** restructure balance lookups ([#133](https://github.com/Increase/increase-java/issues/133)) ([fa1a6f4](https://github.com/Increase/increase-java/commit/fa1a6f428c9490e049ee64bfcc0fd7e42fd407e1))
* **api:** simplify WireDecline and InboundWireTransfer ([#166](https://github.com/Increase/increase-java/issues/166)) ([ad81c09](https://github.com/Increase/increase-java/commit/ad81c091634e71f1922f8dbea3ed86c7c5c9d7d1))
* **api:** split card profile resource into digital and physical card profile resources ([#178](https://github.com/Increase/increase-java/issues/178)) ([7d7ca83](https://github.com/Increase/increase-java/commit/7d7ca83125c210abee638e5fe7704619b54d8bed))
* **api:** update descriptions ([#170](https://github.com/Increase/increase-java/issues/170)) ([7d6be61](https://github.com/Increase/increase-java/commit/7d6be6129ba82a2a2c3fb99415441a8d28784eed))
* **api:** updates ([304a9cb](https://github.com/Increase/increase-java/commit/304a9cb774cacbd7779d42224aeb4bae0bb9b8b2))
* **api:** updates ([#113](https://github.com/Increase/increase-java/issues/113)) ([67067c9](https://github.com/Increase/increase-java/commit/67067c972e8918eebd0f3f00f60b5f01ef414d84))
* **api:** updates ([#116](https://github.com/Increase/increase-java/issues/116)) ([d13497a](https://github.com/Increase/increase-java/commit/d13497abaef4be06b5036cafbe3352cd6f1a6342))
* **api:** updates ([#117](https://github.com/Increase/increase-java/issues/117)) ([a322566](https://github.com/Increase/increase-java/commit/a3225666ace1c02976e2cbfb94670d9b07f12f2f))
* **api:** updates ([#123](https://github.com/Increase/increase-java/issues/123)) ([8e21c8c](https://github.com/Increase/increase-java/commit/8e21c8c3a1fbc6ecdf232e73b077daceda423d9f))
* **api:** updates ([#138](https://github.com/Increase/increase-java/issues/138)) ([faf18f3](https://github.com/Increase/increase-java/commit/faf18f397bd86806eed0a8de8ccf3ac80dc11372))
* **api:** updates ([#52](https://github.com/Increase/increase-java/issues/52)) ([cf6fae1](https://github.com/Increase/increase-java/commit/cf6fae1c8358fb351cd63b2a682390a05dbc5f8c))
* **api:** updates ([#55](https://github.com/Increase/increase-java/issues/55)) ([314adae](https://github.com/Increase/increase-java/commit/314adae061640d5cdd4676126333fa695f2af612))
* **api:** updates ([#70](https://github.com/Increase/increase-java/issues/70)) ([adff556](https://github.com/Increase/increase-java/commit/adff556c31615da8e2f74957d3ca9f49218caf14))
* **ci:** add a publish-sonatype workflow for manual running ([#44](https://github.com/Increase/increase-java/issues/44)) ([fb2d0f4](https://github.com/Increase/increase-java/commit/fb2d0f4bd803d5f51026b3ec7a472de60aaa21da))
* **client:** adjust retry behavior ([#120](https://github.com/Increase/increase-java/issues/120)) ([5a6c25d](https://github.com/Increase/increase-java/commit/5a6c25d13a3c6fb9c42217ea91f4d047c203a626))
* **client:** allow binary returns ([#130](https://github.com/Increase/increase-java/issues/130)) ([8792db9](https://github.com/Increase/increase-java/commit/8792db9268dde067ff796195716255ae2c4daed1))
* **client:** retry on 408 Request Timeout ([#88](https://github.com/Increase/increase-java/issues/88)) ([4315f2c](https://github.com/Increase/increase-java/commit/4315f2c70285a17c9c1e43e21debcd91d98da9f7))
* **core:** add `asUnknown` to `JsonField` ([91433f0](https://github.com/Increase/increase-java/commit/91433f0b9cfe341fb84cb7cfbb14d68ecec46362))
* default timeout is set for java clients ([#59](https://github.com/Increase/increase-java/issues/59)) ([a0bdd18](https://github.com/Increase/increase-java/commit/a0bdd18804c1c9d44f109dc281e34546d7026237))
* **docs:** updates ([40bfd3e](https://github.com/Increase/increase-java/commit/40bfd3ec4c62b89b3f7766b5e24db9d3ddfa41d6))
* generate addXxx methods for array types ([#62](https://github.com/Increase/increase-java/issues/62)) ([031953c](https://github.com/Increase/increase-java/commit/031953c9a0ed7b66d5634b1fd76b944bd0f93431))
* **github:** include a devcontainer setup ([#127](https://github.com/Increase/increase-java/issues/127)) ([df525ac](https://github.com/Increase/increase-java/commit/df525acab18898103973dd47c774885dc8065467))
* improve pagination response types ([7afbb7a](https://github.com/Increase/increase-java/commit/7afbb7afb610572890335ec5cfca10686525f08e))
* **internal:** improve client options ([97f4062](https://github.com/Increase/increase-java/commit/97f4062636ec93aee44cff5b946b3f38ff13f0a1))
* **internal:** improve client options ([97f4062](https://github.com/Increase/increase-java/commit/97f4062636ec93aee44cff5b946b3f38ff13f0a1))
* send Idempotency-Key by default for POST requests ([3821eca](https://github.com/Increase/increase-java/commit/3821ecafd24aa9cf82b20315256120c3ed83ad12))
* send Idempotency-Key by default for POST requests ([3821eca](https://github.com/Increase/increase-java/commit/3821ecafd24aa9cf82b20315256120c3ed83ad12))
* separate types into params/responses packages ([0618345](https://github.com/Increase/increase-java/commit/06183451948f122b437d85b17fc286d873a6e34b))
* separate types into params/responses packages ([0618345](https://github.com/Increase/increase-java/commit/06183451948f122b437d85b17fc286d873a6e34b))
* **tests:** support specifying `SKIP_MOCK_TESTS=true` ([840d385](https://github.com/Increase/increase-java/commit/840d385c9879ec2eef1c90281dd40959f4b4ab48))
* **test:** unskip file uploads tests ([#46](https://github.com/Increase/increase-java/issues/46)) ([bf35772](https://github.com/Increase/increase-java/commit/bf35772430b75426d54380e0393eee100b3e843a))
* use latest Java LTS to build SDK ([c35dba5](https://github.com/Increase/increase-java/commit/c35dba5034113175746d5f9cee7bfd37c7763eeb))
* use latest Java LTS to build SDK ([c35dba5](https://github.com/Increase/increase-java/commit/c35dba5034113175746d5f9cee7bfd37c7763eeb))


### Bug Fixes

* **api:** move ACH Return endpoint and add digital wallet properties ([#77](https://github.com/Increase/increase-java/issues/77)) ([c70a2bb](https://github.com/Increase/increase-java/commit/c70a2bba0f8f3a17a9247d7bde039401158e3fe3))
* auto-close responses even if an exception is thrown during deserialization ([#38](https://github.com/Increase/increase-java/issues/38)) ([e8e9452](https://github.com/Increase/increase-java/commit/e8e94521a74091dcff02fcb01ef0e2f6a5b7636d))
* **ci:** ignore stainless-app edits to release PR title ([#162](https://github.com/Increase/increase-java/issues/162)) ([e839630](https://github.com/Increase/increase-java/commit/e839630f3227cdb1746b1f71327794b90c77000c))
* **docs:** wrong client import in readme usage example ([#175](https://github.com/Increase/increase-java/issues/175)) ([0209695](https://github.com/Increase/increase-java/commit/02096959d4e6b0041c09b810a1a2ed274921960e))
* rename At3dsCapableMerchant and FormSs4 with correct casing ([24d8b04](https://github.com/Increase/increase-java/commit/24d8b040e23a40646516dc254bb2242f697d3291))
* set correct timeouts on okhttp client ([#63](https://github.com/Increase/increase-java/issues/63)) ([f3a4a43](https://github.com/Increase/increase-java/commit/f3a4a43f66b7414e2d60355a87622a8d94be685e))


### Code Refactoring

* **api:** remove many enum members from document category ([#22](https://github.com/Increase/increase-java/issues/22)) ([327d529](https://github.com/Increase/increase-java/commit/327d5293471a4a48503636304812aa1497bc5ef6))
* **api:** rename return reason enum member ([#13](https://github.com/Increase/increase-java/issues/13)) ([22a3fd6](https://github.com/Increase/increase-java/commit/22a3fd63050eab68ff66c84b78968cbed97c8c93))
* fix oauth casing ([#163](https://github.com/Increase/increase-java/issues/163)) ([efbcd65](https://github.com/Increase/increase-java/commit/efbcd65b674c29b91ac20ec7b3d67f4096334bdc))
* rename nested params classes to use singular instead of plural ([e341a2d](https://github.com/Increase/increase-java/commit/e341a2dc2059e58945adf40f422e8ebbc640b1db))

## 0.29.0 (2024-02-15)

Full Changelog: [v0.28.1...v0.29.0](https://github.com/Increase/increase-java/compare/v0.28.1...v0.29.0)

### ⚠ BREAKING CHANGES

* **api:** split card profile resource into digital and physical card profile resources ([#178](https://github.com/Increase/increase-java/issues/178))

### Features

* **api:** split card profile resource into digital and physical card profile resources ([#178](https://github.com/Increase/increase-java/issues/178)) ([bfa4264](https://github.com/Increase/increase-java/commit/bfa4264bd3a62f38bae72e42baac81c9ff931f91))


### Chores

* **ci:** uses Stainless GitHub App for releases ([#176](https://github.com/Increase/increase-java/issues/176)) ([90d7eb3](https://github.com/Increase/increase-java/commit/90d7eb33b8be0628894fcec202272323f7818d6f))

## 0.28.1 (2024-02-13)

Full Changelog: [v0.28.0...v0.28.1](https://github.com/Increase/increase-java/compare/v0.28.0...v0.28.1)

### Bug Fixes

* **docs:** wrong client import in readme usage example ([#175](https://github.com/Increase/increase-java/issues/175)) ([20ca22a](https://github.com/Increase/increase-java/commit/20ca22acdc345c2bd57ede5cb40fa36f74ea79e5))


### Chores

* **interal:** make link to api.md relative ([#174](https://github.com/Increase/increase-java/issues/174)) ([0de109d](https://github.com/Increase/increase-java/commit/0de109ddfb846193f9bf50f49c29669346f5cb43))
* **internal:** support pre-release versioning ([#172](https://github.com/Increase/increase-java/issues/172)) ([2499513](https://github.com/Increase/increase-java/commit/2499513cc830f3b9017f78ba18bf5632a8293c88))

## 0.28.0 (2024-01-26)

Full Changelog: [v0.27.0...v0.28.0](https://github.com/increase/increase-java/compare/v0.27.0...v0.28.0)

### Features

* **api:** update descriptions ([#170](https://github.com/increase/increase-java/issues/170)) ([a8c8e30](https://github.com/increase/increase-java/commit/a8c8e304e7838dd1ac4183fdf3b2a861c193f90c))

## 0.27.0 (2024-01-24)

Full Changelog: [v0.26.0...v0.27.0](https://github.com/increase/increase-java/compare/v0.26.0...v0.27.0)

### Features

* **api:** list Inbound Wire Transfers, change transfer simulation return types ([#168](https://github.com/increase/increase-java/issues/168)) ([f1f92e4](https://github.com/increase/increase-java/commit/f1f92e4057550adb7666d68e8e155fa5a742196d))

## 0.26.0 (2024-01-22)

Full Changelog: [v0.25.0...v0.26.0](https://github.com/increase/increase-java/compare/v0.25.0...v0.26.0)

### Features

* **api:** simplify WireDecline and InboundWireTransfer ([#166](https://github.com/increase/increase-java/issues/166)) ([b50a1d2](https://github.com/increase/increase-java/commit/b50a1d2576ff8e62eb2f864aae78d71637ddaa9b))

## 0.25.0 (2024-01-19)

Full Changelog: [v0.24.1...v0.25.0](https://github.com/increase/increase-java/compare/v0.24.1...v0.25.0)

### ⚠ BREAKING CHANGES

* fix oauth casing ([#163](https://github.com/increase/increase-java/issues/163))

### Features

* **api:** add oauth token and inbound wire transfer methods ([#165](https://github.com/increase/increase-java/issues/165)) ([c84f5c7](https://github.com/increase/increase-java/commit/c84f5c76d166cc5ba20ce7903e1b4e0fa0678f33))


### Refactors

* fix oauth casing ([#163](https://github.com/increase/increase-java/issues/163)) ([97f8bc3](https://github.com/increase/increase-java/commit/97f8bc33b24f8249baeae3161a21e9d7af893cfc))

## 0.24.1 (2024-01-18)

Full Changelog: [v0.24.0...v0.24.1](https://github.com/increase/increase-java/compare/v0.24.0...v0.24.1)

### Bug Fixes

* **ci:** ignore stainless-app edits to release PR title ([#162](https://github.com/increase/increase-java/issues/162)) ([53f2ce3](https://github.com/increase/increase-java/commit/53f2ce3da46d316fadebdbc58f767c9b3d2d21ff))


### Chores

* **internal:** speculative retry-after-ms support ([#161](https://github.com/increase/increase-java/issues/161)) ([835be55](https://github.com/increase/increase-java/commit/835be5523a85169eb1e6a61a3601011e200d2842))
* remove Alex Rattray from reviewers ([#160](https://github.com/increase/increase-java/issues/160)) ([4fe0791](https://github.com/increase/increase-java/commit/4fe079107efea77e189d1d7c25a7762314b73f6b))


### Documentation

* **api:** fix typo ([#158](https://github.com/increase/increase-java/issues/158)) ([9ca5281](https://github.com/increase/increase-java/commit/9ca5281938d52d5113c0cf27153d197bead8401a))

## 0.24.0 (2024-01-12)

Full Changelog: [v0.23.0...v0.24.0](https://github.com/increase/increase-java/compare/v0.23.0...v0.24.0)

### Features

* **api:** add merchant data to simulation api ([#157](https://github.com/increase/increase-java/issues/157)) ([4c03acb](https://github.com/increase/increase-java/commit/4c03acbbc6b849ccbc50fd915d42c3ff5256fc3c))


### Documentation

* **readme:** improve api reference ([#155](https://github.com/increase/increase-java/issues/155)) ([ab22ff4](https://github.com/increase/increase-java/commit/ab22ff40913341ba11e63917530d3d2920686790))

## 0.23.0 (2024-01-12)

Full Changelog: [v0.22.0...v0.23.0](https://github.com/increase/increase-java/compare/v0.22.0...v0.23.0)

### Features

* **api:** allow webhook unwrapping without providing secret ([#153](https://github.com/increase/increase-java/issues/153)) ([4d43deb](https://github.com/increase/increase-java/commit/4d43debf14c0c189832e3927bc1ac321165c45e6))

## 0.22.0 (2024-01-10)

Full Changelog: [v0.21.0...v0.22.0](https://github.com/increase/increase-java/compare/v0.21.0...v0.22.0)

### Features

* **api:** new methods for handling webhooks ([#152](https://github.com/increase/increase-java/issues/152)) ([ce9dcd7](https://github.com/increase/increase-java/commit/ce9dcd79b07450ac63b71640d8d11fef848642c5))


### Chores

* add .keep files for examples and custom code directories ([#149](https://github.com/increase/increase-java/issues/149)) ([2128c4a](https://github.com/increase/increase-java/commit/2128c4a26a2bb68db9bdadac79a0e8e5f6171cdf))
* **internal:** minor improvements to auth code ([#151](https://github.com/increase/increase-java/issues/151)) ([049724d](https://github.com/increase/increase-java/commit/049724da12a9f808c83c2a2756660958cf80bc80))

## 0.21.0 (2024-01-08)

Full Changelog: [v0.20.0...v0.21.0](https://github.com/increase/increase-java/compare/v0.20.0...v0.21.0)

### Features

* **api:** add `ach_debit_status` ([#147](https://github.com/increase/increase-java/issues/147)) ([684e7e3](https://github.com/increase/increase-java/commit/684e7e321a12575927fb6a6234e4fbfce2dd3be0))

## 0.20.0 (2024-01-02)

Full Changelog: [v0.19.0...v0.20.0](https://github.com/increase/increase-java/compare/v0.19.0...v0.20.0)

### Features

* **api:** add real-time payments request for payment endpoints ([#146](https://github.com/increase/increase-java/issues/146)) ([e90c253](https://github.com/increase/increase-java/commit/e90c2536f2f972e90bd292393ab4be9e23ee2b6c))


### Chores

* **internal:** bump license ([#144](https://github.com/increase/increase-java/issues/144)) ([ead155b](https://github.com/increase/increase-java/commit/ead155bed5957b0d56c2974b78bbe023412f18a9))

## 0.19.0 (2023-12-18)

Full Changelog: [v0.18.0...v0.19.0](https://github.com/increase/increase-java/compare/v0.18.0...v0.19.0)

### Features

* **api:** add deposit_submission property to check deposit ([#143](https://github.com/increase/increase-java/issues/143)) ([ded50cf](https://github.com/increase/increase-java/commit/ded50cfc67484b939ab806b3e347bd67e57756cf))


### Chores

* **ci:** run release workflow once per day ([#141](https://github.com/increase/increase-java/issues/141)) ([62b99da](https://github.com/increase/increase-java/commit/62b99da4f86ad849e49b4c6abdbeaf5f04507059))

## 0.18.0 (2023-12-14)

Full Changelog: [v0.17.0...v0.18.0](https://github.com/increase/increase-java/compare/v0.17.0...v0.18.0)

### Features

* **api:** add `suspected_fraud` rejection reason ([#139](https://github.com/increase/increase-java/issues/139)) ([59975c8](https://github.com/increase/increase-java/commit/59975c8621e1539cbcefed3f3fe7df8ce54c5992))

## 0.17.0 (2023-12-08)

Full Changelog: [v0.16.1...v0.17.0](https://github.com/increase/increase-java/compare/v0.16.1...v0.17.0)

### Features

* **api:** updates ([#138](https://github.com/increase/increase-java/issues/138)) ([acb3057](https://github.com/increase/increase-java/commit/acb305739e1442b506eed925d58f5aa0974df5b3))

## 0.16.1 (2023-12-04)

Full Changelog: [v0.16.0...v0.16.1](https://github.com/increase/increase-java/compare/v0.16.0...v0.16.1)

## 0.16.0 (2023-11-08)

Full Changelog: [v0.15.0...v0.16.0](https://github.com/increase/increase-java/compare/v0.15.0...v0.16.0)

### Features

* **api:** restructure balance lookups ([#133](https://github.com/increase/increase-java/issues/133)) ([df5c606](https://github.com/increase/increase-java/commit/df5c6061d21f78c7c1efd1a1e67015728831b87e))
* **client:** allow binary returns ([#130](https://github.com/increase/increase-java/issues/130)) ([42fa3f6](https://github.com/increase/increase-java/commit/42fa3f6b2a3d59db773864fa6777b3e64d244a3a))


### Chores

* remove bad tests ([#132](https://github.com/increase/increase-java/issues/132)) ([79de2de](https://github.com/increase/increase-java/commit/79de2de31d1709a02e66a3e340f988d6bb26cec2))

## 0.15.0 (2023-11-01)

Full Changelog: [v0.14.0...v0.15.0](https://github.com/increase/increase-java/compare/v0.14.0...v0.15.0)

### Features

* **api:** add failed to export status enum ([#129](https://github.com/increase/increase-java/issues/129)) ([c4adbf4](https://github.com/increase/increase-java/commit/c4adbf49e763136385e8dec8d6e087f968709aa8))
* **github:** include a devcontainer setup ([#127](https://github.com/increase/increase-java/issues/127)) ([d958435](https://github.com/increase/increase-java/commit/d958435e7ee726f7eba9b0decd7c039aa1f49954))

## 0.14.0 (2023-10-27)

Full Changelog: [v0.13.0...v0.14.0](https://github.com/increase/increase-java/compare/v0.13.0...v0.14.0)

### Features

* **api:** add network identifiers and effective date ([#125](https://github.com/increase/increase-java/issues/125)) ([3a24b45](https://github.com/increase/increase-java/commit/3a24b45e00b21c859fffa467a738bf226b01bdaa))

## 0.13.0 (2023-10-26)

Full Changelog: [v0.12.0...v0.13.0](https://github.com/increase/increase-java/compare/v0.12.0...v0.13.0)

### Features

* **api:** updates ([#123](https://github.com/increase/increase-java/issues/123)) ([733ab3d](https://github.com/increase/increase-java/commit/733ab3df013fc7a59636c7072cf832a802329452))

## 0.12.0 (2023-10-24)

Full Changelog: [v0.11.0...v0.12.0](https://github.com/increase/increase-java/compare/v0.11.0...v0.12.0)

### Features

* **api:** add fuel confirmation functionality ([#119](https://github.com/increase/increase-java/issues/119)) ([21a4d0d](https://github.com/increase/increase-java/commit/21a4d0d17cc0c32c39aa151f7c6a7cd1b0094f75))
* **api:** add returned_per_odfi_request enum ([#118](https://github.com/increase/increase-java/issues/118)) ([10154b3](https://github.com/increase/increase-java/commit/10154b3f46a4ac24422f9b7c18fb30cd7697b05b))
* **api:** updates ([#116](https://github.com/increase/increase-java/issues/116)) ([3c1acdc](https://github.com/increase/increase-java/commit/3c1acdcfb986347c9d0bb423e8ecb5ce85e9dcba))
* **api:** updates ([#117](https://github.com/increase/increase-java/issues/117)) ([a5515c1](https://github.com/increase/increase-java/commit/a5515c1aad75a14ba859c290891e3c0ea3ac0759))
* **client:** adjust retry behavior ([#120](https://github.com/increase/increase-java/issues/120)) ([c632636](https://github.com/increase/increase-java/commit/c632636f2acdd1a9738b524408f218458134784e))

## 0.11.0 (2023-10-19)

Full Changelog: [v0.10.5...v0.11.0](https://github.com/increase/increase-java/compare/v0.10.5...v0.11.0)

### Features

* **api:** add addenda details for ACH transfers ([#112](https://github.com/increase/increase-java/issues/112)) ([77c3b66](https://github.com/increase/increase-java/commit/77c3b662faf64888d99fd4438bac6186d6cc5f5f))
* **api:** updates ([#113](https://github.com/increase/increase-java/issues/113)) ([e9d92f2](https://github.com/increase/increase-java/commit/e9d92f2c806d31e1d7229606999642e5782eacd3))


### Chores

* add case insensitive get header function ([#110](https://github.com/increase/increase-java/issues/110)) ([c8a6a01](https://github.com/increase/increase-java/commit/c8a6a010d7e206f4c78200712f7241de79fc130b))
* **internal:** minor reformatting ([#108](https://github.com/increase/increase-java/issues/108)) ([df9d4a7](https://github.com/increase/increase-java/commit/df9d4a7f834cd70a4cf24705c99b246141300fd7))
* **internal:** rearrange client arguments ([#106](https://github.com/increase/increase-java/issues/106)) ([42efa26](https://github.com/increase/increase-java/commit/42efa26e7f91e044a77fd199ac21a2e775e95365))
* update README ([#105](https://github.com/increase/increase-java/issues/105)) ([a2b123b](https://github.com/increase/increase-java/commit/a2b123b13a8f02e2581aa0215fb66dad65f03ba4))


### Documentation

* organisation -&gt; organization (UK to US English) ([#111](https://github.com/increase/increase-java/issues/111)) ([48e3f4b](https://github.com/increase/increase-java/commit/48e3f4b2271c68702d1a6001848a170548e2e73d))

## 0.10.5 (2023-10-05)

Full Changelog: [v0.10.4...v0.10.5](https://github.com/increase/increase-java/compare/v0.10.4...v0.10.5)

### Features

* **api:** add direction property to CardAuthorization ([#104](https://github.com/increase/increase-java/issues/104)) ([9dc87fa](https://github.com/increase/increase-java/commit/9dc87fa91bb134a64356f5205223acc53ff710e7))
* **api:** expand event categories and Entity status options ([#102](https://github.com/increase/increase-java/issues/102)) ([458aff0](https://github.com/increase/increase-java/commit/458aff0194b8bacc123ff43832f4e63ba98e24bf))


### Chores

* **internal:** add a top-level generated comment to each file ([#103](https://github.com/increase/increase-java/issues/103)) ([8886f78](https://github.com/increase/increase-java/commit/8886f78e8b91aaa4d196969db6c56e5adbf6cb5d))

## 0.10.4 (2023-09-29)

Full Changelog: [v0.10.3...v0.10.4](https://github.com/Increase/increase-java/compare/v0.10.3...v0.10.4)

### Features

* **api:** add card payments endpoints ([#98](https://github.com/Increase/increase-java/issues/98)) ([de741df](https://github.com/Increase/increase-java/commit/de741df4b966b9a2944171a5962bc633df94e5cd))
* **api:** add physical cards endpoints ([#96](https://github.com/Increase/increase-java/issues/96)) ([1a9971a](https://github.com/Increase/increase-java/commit/1a9971a89a4064890ab2cf44be3515cfb832dfa6))

## 0.10.3 (2023-09-22)

Full Changelog: [v0.10.2...v0.10.3](https://github.com/increase/increase-java/compare/v0.10.2...v0.10.3)

### Features

* **api:** add inbound checks, originating routing number and new event types ([#94](https://github.com/increase/increase-java/issues/94)) ([784d32d](https://github.com/increase/increase-java/commit/784d32d9f8c5f85aee2c842275e7100969493659))

## 0.10.2 (2023-09-20)

Full Changelog: [v0.10.1...v0.10.2](https://github.com/Increase/increase-java/compare/v0.10.1...v0.10.2)

### Features

* **api:** add entity_id to Card and make relationship nullable ([#91](https://github.com/Increase/increase-java/issues/91)) ([654c2b6](https://github.com/Increase/increase-java/commit/654c2b6862e18ee874a765f265e7ad66d51219ac))
* **api:** export account statements in OFX format ([#93](https://github.com/Increase/increase-java/issues/93)) ([a73aa41](https://github.com/Increase/increase-java/commit/a73aa41501360700bd1a77fe6c4e2dbe3283542b))

## 0.10.1 (2023-09-15)

Full Changelog: [v0.10.0...v0.10.1](https://github.com/increase/increase-java/compare/v0.10.0...v0.10.1)

### Features

* **api:** add card payment ID reference to transaction models ([#86](https://github.com/increase/increase-java/issues/86)) ([1b3a36d](https://github.com/increase/increase-java/commit/1b3a36d1a0496d700001d81b5b08e27d386038c4))
* **client:** retry on 408 Request Timeout ([#88](https://github.com/increase/increase-java/issues/88)) ([04b7e97](https://github.com/increase/increase-java/commit/04b7e97720d83ae7832ebdd30a23758f32ac2f96))

## 0.10.0 (2023-09-12)

Full Changelog: [v0.9.3...v0.10.0](https://github.com/increase/increase-java/compare/v0.9.3...v0.10.0)

### ⚠ BREAKING CHANGES

* **api:** remove Limits API, add ACH controls to Account Numbers   ([#84](https://github.com/increase/increase-java/issues/84))

### Features

* **api:** remove Limits API, add ACH controls to Account Numbers   ([#84](https://github.com/increase/increase-java/issues/84)) ([d16d5a0](https://github.com/increase/increase-java/commit/d16d5a05f9ad9f7094960830a27e0ec47cfb4490))

## 0.9.3 (2023-09-07)

Full Changelog: [v0.9.2...v0.9.3](https://github.com/increase/increase-java/compare/v0.9.2...v0.9.3)

### Features

* **api:** add bank_of_first_deposit_routing_number and transfer_id properties ([#80](https://github.com/increase/increase-java/issues/80)) ([2fff0d2](https://github.com/increase/increase-java/commit/2fff0d2fd51acd1a47d30f9e616dbe0f1c442c34))
* **api:** add Update Address  and Create Notification Change endpoints ([#82](https://github.com/increase/increase-java/issues/82)) ([9c3264c](https://github.com/increase/increase-java/commit/9c3264cd76bfa453578975c53c24582e09f5d678))


### Documentation

* **api:** add docstrings and refine enum types ([#83](https://github.com/increase/increase-java/issues/83)) ([46bd156](https://github.com/increase/increase-java/commit/46bd156249680b657f6fc25b85b07eea2161dfa5))

## 0.9.2 (2023-08-29)

Full Changelog: [v0.9.1...v0.9.2](https://github.com/Increase/increase-java/compare/v0.9.1...v0.9.2)

### Features

* **api:** remove unused `/inbound_ach_transfer_returns` endpoints ([#78](https://github.com/Increase/increase-java/issues/78)) ([08b2921](https://github.com/Increase/increase-java/commit/08b29215f1c5ea5f95d988a1a23843a6e20af58e))


### Bug Fixes

* **api:** move ACH Return endpoint and add digital wallet properties ([#77](https://github.com/Increase/increase-java/issues/77)) ([f481290](https://github.com/Increase/increase-java/commit/f481290971e22901de5211a6ffe9ab134b9a475b))


### Chores

* **ci:** setup workflows to create releases and release PRs ([#74](https://github.com/Increase/increase-java/issues/74)) ([b1aa07e](https://github.com/Increase/increase-java/commit/b1aa07ee5f288efa0490cbc2e12f2a5c2a2684bd))

## [0.9.1](https://github.com/Increase/increase-java/compare/v0.9.0...v0.9.1) (2023-08-27)


### Features

* **api:** move inbound ACH transfer returns (⚠️ breaking); add ACH transfer declines ([#72](https://github.com/Increase/increase-java/issues/72)) ([162f32f](https://github.com/Increase/increase-java/commit/162f32f3fe6dbc318fc9180bafa80d2a9f9944e7))
* **api:** updates ([#70](https://github.com/Increase/increase-java/issues/70)) ([adff556](https://github.com/Increase/increase-java/commit/adff556c31615da8e2f74957d3ca9f49218caf14))


### Chores

* **internal:** minor code re-ordering ([#71](https://github.com/Increase/increase-java/issues/71)) ([15fbcdd](https://github.com/Increase/increase-java/commit/15fbcddc51cc316546e66f6e976db3d916cd486f))

## [0.9.0](https://github.com/Increase/increase-java/compare/v0.8.4...v0.9.0) (2023-08-17)


### ⚠ BREAKING CHANGES

* **api:** change `physical_cards.status` value, remove `event_subscription` field, add fields ([#65](https://github.com/Increase/increase-java/issues/65))

### Features

* **api:** change `physical_cards.status` value, remove `event_subscription` field, add fields ([#65](https://github.com/Increase/increase-java/issues/65)) ([5b2c460](https://github.com/Increase/increase-java/commit/5b2c46083e373868e2dc8bc04577e2448444c191))

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
