package com.app.ktorandroidchat.presentation.chat

import com.app.ktorandroidchat.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)
