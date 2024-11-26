package com.developerssays.bookloom.compounds

import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.developerssays.bookloom.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookLoomTopAppBar(
    onNavigationIconClicked :()->Unit
) {

    val context = LocalContext.current
    TopAppBar(
      //  modifier = Modifier.padding(10.dp),
        title = { BookLoomText(string = "Home") },
        navigationIcon = {
            IconButton(onClick = { onNavigationIconClicked.invoke()

                Toast.makeText(context, "onNavigationIconClicked",
                    Toast.LENGTH_SHORT).show()})
            {
                Icon(Icons.Default.Menu, contentDescription = "NavigationIcon")
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(colorResource(id = R.color.appBarContainer))

    )
}
