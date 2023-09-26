package com.example.belajarandroid.domain

class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUseCase {
	override fun getMessage(name: String): MessageEntity {
		return messageRepository.getMessage(name)
	}
}