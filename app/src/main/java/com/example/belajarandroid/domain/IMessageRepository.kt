package com.example.belajarandroid.domain

interface IMessageRepository {
	fun getMessage(name : String) : MessageEntity
}