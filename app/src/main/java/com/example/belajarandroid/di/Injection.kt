package com.example.belajarandroid.di

import com.example.belajarandroid.data.IMessageDataSource
import com.example.belajarandroid.data.MessageDataSource
import com.example.belajarandroid.data.MessageRepository
import com.example.belajarandroid.domain.IMessageRepository
import com.example.belajarandroid.domain.MessageInteractor
import com.example.belajarandroid.domain.MessageUseCase

object Injection {
	fun provideUseCase(): MessageUseCase {
		val messageRepository = provideRepository()
		return MessageInteractor(messageRepository)
	}
	
	private fun provideRepository(): IMessageRepository {
		val messageDataSource = provideDataSource()
		return MessageRepository(messageDataSource)
	}
	
	private fun provideDataSource(): IMessageDataSource {
		return MessageDataSource()
	}
}