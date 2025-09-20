import { Text, View } from 'react-native';
import Somar from './components/Somar';
import Function from './components/Function';

export default function App() {
  return (
    <View>
      <Somar/>
      <Text>Numero escolhido: <Function numero={9}/></Text>
    </View>
  );
}
