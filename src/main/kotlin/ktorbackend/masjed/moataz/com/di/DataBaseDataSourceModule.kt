package ktorbackend.masjed.moataz.com.di

import ktorbackend.masjed.moataz.com.database.datasource.DataBaseDataSource
import ktorbackend.masjed.moataz.com.database.datasource.DataBaseDataSourceImpl
import org.koin.dsl.module

val dataBaseDataSourceModule = module {
    single<DataBaseDataSource> { DataBaseDataSourceImpl(get()) }
}
