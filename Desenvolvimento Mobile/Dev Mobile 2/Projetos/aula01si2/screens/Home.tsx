import React from "react";
import { View, Text, Image, FlatList, TouchableOpacity, Dimensions } from "react-native";

export default function Home(){

    const selectedChatFace = {
        id:2,
        name:'Pogu',
        image: 'https://res.cloudinary.com/dknvsbuyy/image/upload/v1685709886/image_21_2e18bb4a61.png',
        primary: '#E53057',
        secondary:''
    }

    return(
        <View style={{ alignItems: 'center', paddingTop: 90 }}>
            <Text style={[
                { color: selectedChatFace?.primary },
                { fontSize: 30, fontWeight: 'bold' }
            ]}>
                Ola, eu sou {selectedChatFace?.name}</Text>

            <Image source={{ uri: selectedChatFace?.image }}
            style= {{ height: 150, width: 150, marginTop: 20}} />

            
        <TouchableOpacity
            style={[
            
            {backgroundColor: selectedChatFace?.primary ?? '#000'},
            
            {
                marginTop: 40,
                padding: 17,
                width: Dimensions.get('screen').width * 0.6,
                borderRadius: 100,
                alignItems: 'center'
            }]}
        >
                <Text style={[{ fontSize: 16, color: '#fff' }]}>Vamos conversar</Text>
            </TouchableOpacity>
        </View>
    )
}