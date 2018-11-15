object Versions {
    //base
    val gsonVersion = "2.8.5"
    val glide = "4.8.0"
    val BaseRecyclerView = "2.9.43-alpha1"
    val loading = "1.2.0"
    val smartrefresh = "1.1.0-alpha-15"
    val logger = "2.2.0"

    //rx
    val rxjavaVersion = "2.2.3"
    val rxandroidVersion = "2.1.0"
    val rxpermissionsVersion = "0.10.2"
    val rxcache = "1.8.3-2.x"

    //network
    val okhttp = "3.11.0"
    val retrofitVersion = "2.4.0"
}

object AsLibs {
    //base
    val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    val BaseRecyclerView = "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Versions.BaseRecyclerView}"
    val loading = "com.github.ybq:AndroidSpinKit:${Versions.loading}"
    val smartrefresh = "com.scwang.smartrefresh:SmartRefreshLayout:${Versions.smartrefresh}"
    val logger = "com.orhanobut:logger:${Versions.logger}"

    // rx
    val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjavaVersion}"
    val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroidVersion}"
    val rxpermissions = "com.github.tbruyelle:rxpermissions:${Versions.rxpermissionsVersion}"
    val rxcache = "com.github.VictorAlbertos.RxCache:runtime:${Versions.rxcache}"
    val rxcacheJolyglot = "com.github.VictorAlbertos.Jolyglot:gson:0.0.4"

    //network
    val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitVersion}"
    val retrofitConverters = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
}