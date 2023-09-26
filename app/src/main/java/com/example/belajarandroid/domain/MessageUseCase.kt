package com.example.belajarandroid.domain

interface MessageUseCase {
	fun getMessage(name : String) : MessageEntity
}