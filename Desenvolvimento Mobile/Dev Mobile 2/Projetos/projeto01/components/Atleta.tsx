import { Component } from "react"
import { StyleSheet, View, Text, Button } from "react-native";


class Atleta extends Component {
    state = {
        peso: 90,
        altura: 2,
    };

    aumentarPeso = () => {
        this.setState({peso: this.state.peso + 1});
    }

    diminuirPeso = () => {
        this.setState({peso: this.state.peso - 1})
    };

    aumentarAltura = () => {
        this.setState({altura: this.state.altura + 0.1})
    }

    diminuirAltura = () => {
        this.setState({altura: this.state.altura - 0.1})
    }


    render() {
        const { peso, altura } = this.state;
        const imc = peso / (altura * altura);

        return (
            <View style={styles.center}>
                <Text>Peso: {peso} kg</Text>
                <Text>Altura: {altura} m</Text>
                <Text>IMC: {imc.toFixed(2)}</Text>
                <View style={styles.buttons}>
                    <Button title="Aumentar Peso" onPress={this.aumentarPeso}></Button>
                    <Button title="Diminuir Peso" onPress={this.diminuirPeso}></Button>
                    <Button title="Aumentar Altura" onPress={this.aumentarAltura}></Button>
                    <Button title="Diminuir Altura" onPress={this.diminuirAltura}></Button>
                </View>
            </View>
        );
    }
}

export default Atleta;

const styles = StyleSheet.create ({
    center: {
        alignItems: 'center',
        marginTop: 50,
    },
    buttons: {
        marginTop: 20,
        flexDirection: 'row',
        justifyContent: 'space-around',
        width: '60%'
    },
})