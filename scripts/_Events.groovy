
eventStatusFinal = { msg ->
    String.metaClass.say = {
        ["osascript", "-e", "tell application \"iTunes\" to set sound volume to 30"].execute()
   	    sleep(300)
        "say \"${delegate}\"".execute().waitFor()
   	    ["osascript", "-e", "tell application \"iTunes\" to set sound volume to 100"].execute()
    }

    if(msg.startsWith("Server running.")) {
   	    "Application is running".say()
    } else {
        msg.say()
   	}
}
