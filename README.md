## Jailbreak/Root Detection Plugin for Apache Cordova

## inspired from https://github.com/leecrossley/cordova-plugin-jailbreak-detection

## Install

### Locally

```
cordova plugin add https://github.com/jimmyliao/cordova-plugin-device-detection.git
```

## Usage

## isRoot
```js
window.plugins.deviceDetection.isRoot(onSuccess, onFail);
```

- => `successCallback` is called with true if the device is Rooted, otherwise false
- => `failureCallback` is called if there was an error determining if the device is Rooted


### isJailbroken

```js
window.plugins.deviceDetection.isJailBreak(onSuccess, onFail);
```

- => `successCallback` is called with true if the device is Jailbroken, otherwise false
- => `failureCallback` is called if there was an error determining if the device is Jailbroken

## Platform Support

Android.

iOS is deriving from https://github.com/leecrossley/cordova-plugin-jailbreak-detection.

## License

[MIT License](http://ilee.mit-license.org)
