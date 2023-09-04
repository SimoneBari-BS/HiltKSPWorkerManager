## Hilt + KSP + WorkManager issue

This PR showcases an issue encountered when using Hilt and WorkManagers with KSP.

To see the issue, you can switch to the `ksp` branch, compile and run the application.
In the logcat, you should see something like this:

```kotlin
Could not instantiate com.example.workmanager.DummyWorkManager
java.lang.NoSuchMethodException: com.example.workmanager.DummyWorkManager.<init> [class android.content.Context, class androidx.work.WorkerParameters]
	at java.lang.Class.getConstructor0(Class.java:2363)
	at java.lang.Class.getDeclaredConstructor(Class.java:2201)
	at androidx.work.WorkerFactory.createWorkerWithDefaultFallback(WorkerFactory.java:95)
	at androidx.work.impl.WorkerWrapper.runWorker(WorkerWrapper.java:243)
	at androidx.work.impl.WorkerWrapper.run(WorkerWrapper.java:145)
	at androidx.work.impl.utils.SerialExecutorImpl$Task.run(SerialExecutorImpl.java:96)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1137)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:637)
	at java.lang.Thread.run(Thread.java:1012)
```

The same problem does not occur when using kapt. 
This can be verified by switching to the `kapt` branch, compiling and running the application.