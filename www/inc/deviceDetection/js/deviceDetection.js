function deviceDetection() {
}

deviceDetection.prototype.isRoot = function(success, fail) {
    cordova.exec(success, fail, "deviceDetection","isRoot", []);
};

deviceDetection.prototype.isJailBreak = function(success, fail) {
    cordova.exec(success, fail, "deviceDetection","isJailBreak", []);
};

deviceDetection.install = function () {
    if (!window.plugins) {
        window.plugins = {};
    }
    
    window.plugins.deviceDetection = new deviceDetection();
    return window.plugins.deviceDetection;
};

cordova.addConstructor(deviceDetection.install);
