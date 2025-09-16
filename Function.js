import {View, Text}from 'react-native';

export default function Function(props){
  return(
    <View>
    {numeroDigitado(props.numero)}
    </View>
  );
}

function numeroDigitado(numero){
  return numero;
}
