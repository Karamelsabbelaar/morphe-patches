# Dutch Pepper Patches

Patches for the Dutch Pepper Android app, for use with [Morphe](https://morphe.software).

## Add this source to Morphe

[Add daqot-The-real-one/morphe-patches to Morphe](https://morphe.software/add-source?github=daqot-The-real-one/morphe-patches)

This fork targets Pepper package IDs `com.tippingcanoe.peppernl` and
`com.tippingcanoe.pepper`.

## Patches

- **GmsCore support** — Sign in with Google using [MicroG-RE](https://github.com/MorpheApp/MicroG-RE/releases/latest) instead of Google Play services. Push notifications also use MicroG-RE.
- **Remove ads** — Removes ads between deals and on deal pages.
- **Sanitize deal links** — Opens deal store pages directly, without tracking redirects or affiliate links.
- **Sanitize sharing links** — Shares direct links to deals and discussions instead of tracking redirects.

## Build locally

- Run `./gradlew buildAndroid`.
- The `.mpp` file is generated in `patches/build/libs/`.
- Apply it with [Morphe-Desktop](https://github.com/MorpheApp/morphe-desktop).

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## License

Licensed under the [GNU General Public License v3.0](LICENSE).
