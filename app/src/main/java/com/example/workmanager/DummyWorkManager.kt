package com.example.workmanager

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class DummyWorkManager @AssistedInject constructor(
    @Assisted val context: Context,
    @Assisted workerParams: WorkerParameters,
    val dummy: Dummy,
) : CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result = Result.success()
}
