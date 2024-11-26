package com.developerssays.bookloom.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.developerssays.bookloom.R
import com.developerssays.bookloom.compounds.BookLoomTextHeading


@Composable
fun HomeScreen() {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BookLoomTextHeading(string = "Technology")
        Card (
            colors = CardDefaults.cardColors(colorResource(id = R.color.cardcolor)),
            elevation = CardDefaults.elevatedCardElevation(10.dp)
        )
        {
            LazyRow(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
                contentPadding = PaddingValues(5.dp)
            )
            {
                items(10){
                    Card(modifier = Modifier
                        .size(100.dp)
                        .padding(5.dp),
                        colors = CardDefaults.cardColors(colorResource(id = R.color.appBarContainer)))
                    {
                        Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                            contentDescription ="",
                            modifier = Modifier
                                .size(80.dp)
                                .padding(top = 0.dp, bottom = 2.dp, end = 2.dp)
                                .clip(shape = RoundedCornerShape(10.dp)) )


                    }
                }


            }

        }

    }
}