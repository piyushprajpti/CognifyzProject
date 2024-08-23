package com.piyushprajpti.cognifyzproject.util

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Accessibility
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Work
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.fastJoinToString
import com.piyushprajpti.cognifyzproject.ui.theme.PrimaryColor

@Composable
fun DataCard(
    userData: UserData
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(2.dp, PrimaryColor, RoundedCornerShape(12.dp))
            .padding(10.dp)
    ) {
        Field(icon = Icons.Outlined.AccountCircle, value = userData.name)
        Field(icon = Icons.Outlined.Person, value = userData.age.toString() + " years")
        Field(icon = Icons.Outlined.Email, value = userData.email)
        Field(icon = Icons.Outlined.Phone, value = userData.phone)
        Field(icon = Icons.Outlined.Language, value = userData.website)
        Field(icon = Icons.Outlined.Work, value = userData.occupation)
        Field(
            icon = Icons.Outlined.Home,
            value = userData.address.street + ", " + userData.address.city + ", " + userData.address.zip
        )
        Field(icon = Icons.Outlined.Accessibility, value = userData.hobbies.fastJoinToString())
    }

    Spacer(modifier = Modifier.height(15.dp))
}

@Composable
fun Field(
    icon: ImageVector,
    value: String
) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = icon, contentDescription = "icon", tint = PrimaryColor)
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = value, fontSize = 14.sp, color = Color.DarkGray)
    }
    Spacer(modifier = Modifier.height(5.dp))
}
