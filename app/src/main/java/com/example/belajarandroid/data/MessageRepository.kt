package com.example.belajarandroid.data

import com.example.belajarandroid.domain.IMessageRepository
import com.example.belajarandroid.domain.MessageEntity

class MessageRepository(val messageDataSource: IMessageDataSource) : IMessageRepository{
	override fun getMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}