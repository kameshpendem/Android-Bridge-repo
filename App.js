import { StyleSheet, Text, View,Button, NativeModules } from 'react-native'
import React from 'react'

const App = () => {
   const handlePress = ()=>{
console.log("pressed");
var CustomModule = NativeModules.CustomModule;
CustomModule.show();
  };
  return (
    <View style={{flex:1,justifyContent:'center',alignItems:'center'}}>
      <Text>App</Text>
      <Button title='click me!' onPress={() => handlePress()}/>
    </View>
  )
}

export default App
