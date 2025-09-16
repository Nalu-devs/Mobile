import {View, StyleSheet} from 'react-native';
import Estilo from './Estilo/Estilo';

export default function App(){
  return(
    <View style={Estilo.container}>
    <View style={Estilo.quadradoRosa}/>
    <View style={Estilo.quadradoVermelho}/>
    </View>
  );
}
