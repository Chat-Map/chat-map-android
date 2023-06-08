package com.chatmap.chats.impl.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.chatmap.common.ui.theme.ApplicationTheme

@Composable
internal fun ChatItem(image: String) {
    val context = LocalContext.current

    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        AsyncImage(
            modifier = Modifier
                .size(80.dp)
                .padding(16.dp),
            model = ImageRequest.Builder(context)
                .data(image)
                .build(),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )

        var ids = remember {
            val i = 1
            mutableStateOf(i)
        }
        val id = remember {
            mutableStateOf(ids.value)
        }

        Column {
            Text(
                text = "Bryan $id",
                color = MaterialTheme.colorScheme.onBackground,
            )
            Text(
                modifier = Modifier.padding(top = 4.dp),
                text = "What do you think?",
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Preview
@Composable
private fun ChatItemPreview() {
    ApplicationTheme() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            ChatItem("")
            ChatItem("")
        }
    }
}
