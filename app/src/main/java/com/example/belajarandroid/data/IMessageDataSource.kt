package com.example.belajarandroid.data

import com.example.belajarandroid.domain.MessageEntity

interface IMessageDataSource {
	fun getMessageFromSource(name : String) : MessageEntity
}