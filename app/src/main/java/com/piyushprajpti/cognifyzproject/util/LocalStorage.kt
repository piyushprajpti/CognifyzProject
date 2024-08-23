package com.piyushprajpti.cognifyzproject.util

import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.RoomDatabase

@Entity(tableName = "user_entity")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "age")
    val age: Int,

    @ColumnInfo(name = "username")
    val username: String,

    @ColumnInfo(name = "email")
    val email: String,

    @Embedded
    val address: AddressEntity,

    @ColumnInfo(name = "phone")
    val phone: String,

    @ColumnInfo(name = "website")
    val website: String,

    @ColumnInfo(name = "occupation")
    val occupation: String,

    @ColumnInfo(name = "hobbies")
    val hobbies: String
)

data class AddressEntity(
    @ColumnInfo(name = "street")
    val street: String,

    @ColumnInfo(name = "city")
    val city: String,

    @ColumnInfo(name = "zip")
    val zip: String
)

@Dao
interface UserDao {
    @Query("SELECT * FROM user_entity")
    fun getAllUsersList(): List<UserEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertUsers(users: List<UserEntity>)
}

@Database(entities = [UserEntity::class], version = 1)
abstract class UserDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
}