public class ryey.easer.commons.local_plugin.b.c {
  ryey.easer.commons.local_plugin.b.c(java.util.HashMap<java.lang.String, java.lang.String>);
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #14                 // Field a:Ljava/util/HashMap;
       9: return

  public java.lang.String a(java.lang.String);
    Code:
       0: aload_1
       1: astore_2
       2: aload_0
       3: getfield      #14                 // Field a:Ljava/util/HashMap;
       6: aload_1
       7: invokevirtual #24                 // Method java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
      10: ifeq          25
      13: aload_0
      14: getfield      #14                 // Field a:Ljava/util/HashMap;
      17: aload_1
      18: invokevirtual #28                 // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
      21: checkcast     #30                 // class java/lang/String
      24: astore_2
      25: aload_2
      26: areturn
}
