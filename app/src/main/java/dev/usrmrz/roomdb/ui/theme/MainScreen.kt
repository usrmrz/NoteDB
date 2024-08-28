package dev.usrmrz.roomdb.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.usrmrz.roomdb.MainViewModel

//@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun MainScreen(
    mainViewModel: MainViewModel = viewModel(
        factory = MainViewModel.factory)
) {
    val itemsList = mainViewModel.itemsList.collectAsState(
        initial = emptyList())
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = mainViewModel.newText.value,
                onValueChange = {
                    mainViewModel.newText.value = it
                },
                label = {
                    Text(text = "Add a word...")
                },
                modifier = Modifier
                    .weight(1f),
                colors = TextFieldDefaults
                    .colors(
                        unfocusedContainerColor = Color.White,
                    )
            )
            IconButton(
                onClick = {
                    mainViewModel.insertItem()
                }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }
        }
        Spacer(
            modifier = Modifier
                .height(5.dp)
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            items(itemsList.value) { item ->
                ListItem(item, {
                    mainViewModel.nameEntity = it
                    mainViewModel.newText.value = it.name
                },
                    {
                        mainViewModel.deleteItem(it)
                    }
                )
            }
        }
    }
}