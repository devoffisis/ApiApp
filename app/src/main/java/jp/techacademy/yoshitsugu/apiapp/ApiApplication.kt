package jp.techacademy.yoshitsugu.apiapp

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class ApiApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val config=RealmConfiguration.Builder()
            .allowQueriesOnUiThread(true)
            .allowWritesOnUiThread(true)
            .deleteRealmIfMigrationNeeded()   //モデルクラスを変更した際にエラーが出なくなる
            .build()
        Realm.setDefaultConfiguration(config)
    }
}
