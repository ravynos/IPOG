import React from "react";
import { View, Text, Image, FlatList, TouchableOpacity, Dimensions } from "react-native";
import faceData from "../services/ChatFaceData";
import { useState } from "react";
import { useEffect } from "react";

export default function Home(){
        const [ChatFaceData, setChatFaceData] = useState(faceData)
        const [selectedChatFace, setSelectedChatFace] =  useState<{
            id: number;
            name: string;
            image:string;
            primary: string;
            secondary: string;
        } | null> (null);

    return(
        <View style={{ alignItems: 'center', paddingTop: 90 }}>
            <Text style={[
                { color: selectedChatFace?.primary },
                { fontSize: 30, fontWeight: 'bold' }
            ]}>
                Ola, eu sou {selectedChatFace?.name}</Text>

            <Image source={{ uri: selectedChatFace?.image }}
            style= {{ height: 150, width: 150, marginTop: 20}} />

            <View style={{
                marginTop:20,
                backgroundColor: '#F5F5F5',
                alignItems:'center',
                height:110,
                padding:10,
                borderRadius:10
            }}>

                <FlatList
                    data={ChatFaceData.filter(item => selectedChatFace?.id !== item.id)}
                    horizontal={true}
                    keyExtractor={item => item.id.toString()}
                    renderItem={({ item }) => (
                        <TouchableOpacity style={{ margin: 15}} onPress={() => setSelectedChatFace(item)}>
                            <Image source={{ uri: item.image }} style={{ width:40, height:40 }} />
                        </TouchableOpacity>
                    )
                }
                />

            </View>

            
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