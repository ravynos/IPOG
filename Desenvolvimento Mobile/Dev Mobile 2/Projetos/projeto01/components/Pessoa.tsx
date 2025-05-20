import { StyleSheet, Text, View } from "react-native";

const Pessoa = (props: {nome: string, idade:number} ) => {
    return (
        <View style={styles.center}>
            <Text>Hello {props.nome}, sua idade é {props.idade} anos!!!</Text>
        </View>
    )
}

export default Pessoa;

const styles = StyleSheet.create({
    center: {
        alignItems: 'center'
    }
});