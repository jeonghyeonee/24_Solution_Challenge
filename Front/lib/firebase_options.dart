// File generated by FlutterFire CLI.
// ignore_for_file: lines_longer_than_80_chars, avoid_classes_with_only_static_members
import 'package:firebase_core/firebase_core.dart' show FirebaseOptions;
import 'package:flutter/foundation.dart'
    show defaultTargetPlatform, kIsWeb, TargetPlatform;

/// Default [FirebaseOptions] for use with your Firebase apps.
///
/// Example:
/// ```dart
/// import 'firebase_options.dart';
/// // ...
/// await Firebase.initializeApp(
///   options: DefaultFirebaseOptions.currentPlatform,
/// );
/// ```
class DefaultFirebaseOptions {
  static FirebaseOptions get currentPlatform {
    if (kIsWeb) {
      return web;
    }
    switch (defaultTargetPlatform) {
      case TargetPlatform.android:
        return android;
      case TargetPlatform.iOS:
        return ios;
      case TargetPlatform.macOS:
        return macos;
      case TargetPlatform.windows:
        throw UnsupportedError(
          'DefaultFirebaseOptions have not been configured for windows - '
          'you can reconfigure this by running the FlutterFire CLI again.',
        );
      case TargetPlatform.linux:
        throw UnsupportedError(
          'DefaultFirebaseOptions have not been configured for linux - '
          'you can reconfigure this by running the FlutterFire CLI again.',
        );
      default:
        throw UnsupportedError(
          'DefaultFirebaseOptions are not supported for this platform.',
        );
    }
  }

  static const FirebaseOptions web = FirebaseOptions(
    apiKey: 'AIzaSyDZAH5aJpsr2CeuW6uCVOUDUvi0pckm3Nc',
    appId: '1:153751853428:web:ccce532864bf6c79b1b421',
    messagingSenderId: '153751853428',
    projectId: 'solchall-57053',
    authDomain: 'solchall-57053.firebaseapp.com',
    storageBucket: 'solchall-57053.appspot.com',
    measurementId: 'G-H3VVJ93JBS',
  );

  static const FirebaseOptions android = FirebaseOptions(
    apiKey: 'AIzaSyBkqFHRmITpUAgGB4kGYngE380I8YWIM9w',
    appId: '1:153751853428:android:b69e2270486b92c8b1b421',
    messagingSenderId: '153751853428',
    projectId: 'solchall-57053',
    storageBucket: 'solchall-57053.appspot.com',
  );

  static const FirebaseOptions ios = FirebaseOptions(
    apiKey: 'AIzaSyCoVyLrHsrR2gAfET37PBtEU25cj3luw1M',
    appId: '1:153751853428:ios:638c3c15e8207395b1b421',
    messagingSenderId: '153751853428',
    projectId: 'solchall-57053',
    storageBucket: 'solchall-57053.appspot.com',
    iosClientId: '153751853428-35og7fc59fd5835m6cilgm680m8nev35.apps.googleusercontent.com',
    iosBundleId: 'com.example.frontFlutter',
  );

  static const FirebaseOptions macos = FirebaseOptions(
    apiKey: 'AIzaSyCoVyLrHsrR2gAfET37PBtEU25cj3luw1M',
    appId: '1:153751853428:ios:63de70b6f9f63b74b1b421',
    messagingSenderId: '153751853428',
    projectId: 'solchall-57053',
    storageBucket: 'solchall-57053.appspot.com',
    iosClientId: '153751853428-9fidto9gbss1kt8hd3bm14u2i1uvukvd.apps.googleusercontent.com',
    iosBundleId: 'com.example.frontFlutter.RunnerTests',
  );
}
