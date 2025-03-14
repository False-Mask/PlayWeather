package com.zj.weather.ui.view.city

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zj.weather.R

@Composable
fun CityListTitleBar(onBack: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        IconButton(
            modifier = Modifier.wrapContentWidth(Alignment.End),
            onClick = onBack
        ) {
            Icon(
                imageVector = Icons.Rounded.ArrowBack,
                contentDescription = "back"
            )
        }
        Text(
            text = stringResource(id = R.string.city_title),
            fontSize = 25.sp,
            modifier = Modifier.padding(10.dp)
        )
    }
}

@Preview(showBackground = false, name = "城市列表TitleBar")
@Composable
fun CityListTitleBarPreview() {
    CityListTitleBar {}
}