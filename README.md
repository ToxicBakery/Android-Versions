[![Build Status](https://travis-ci.org/ToxicBakery/Android-Versions.svg?branch=master)](https://travis-ci.org/ToxicBakery/Android-Versions)

# Android Versions
Check versions without typing a bunch of easy to typo nonsense. Uses IntDef for source completion and static methods for easy to read conditionals.

## Usage
Naturally describe what you would like to test much like testing frameworks.

```java
if (Is.greaterThan(LOLLIPOP)) {
    ...
}

if (Is.lessThanOrEqual(JELLY_BEAN_MR1)) {
    ...
}
```

For the SDK versions you can either implement the `SdkVersion` interface or use the definitions directly `SdkVersion.MARSHMALLOW`.

## Gradle
Use `mavenCentral()` repository.

```groovy
compile 'com.ToxicBakery.android.version:versions:+@aar'
```
