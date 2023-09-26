package com.example.belajarandroid.data

import com.example.belajarandroid.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
	override fun getMessageFromSource(name: String) = MessageEntity("INI MESSAGE")
}