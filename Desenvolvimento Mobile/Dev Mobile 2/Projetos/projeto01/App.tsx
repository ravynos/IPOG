import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import Pessoa from './components/Pessoa';
import Atleta from './components/Atleta';

export default function App() {
  return (
    <View style={styles.container}>
      <Pessoa nome='Thiago' idade={35}/>
      <Atleta/>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
