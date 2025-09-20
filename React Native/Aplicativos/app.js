import {SafeAreaView, StatusBar} from 'react-native';
import Estilo from './Estilo/Estilo';
//no lugar de uma view a gente pode usar o fragmento que é tag de inicio e fim sem nada dentro <></>

export default function App(){
  return(
    <>
      <StatusBar barStyle="dark-content" backgroundColor="#fff"/>
      <SafeAreaView style={Estilo.safeAreaViewConteiner}>
      
      </SafeAreaView>
    </>
  );
}
