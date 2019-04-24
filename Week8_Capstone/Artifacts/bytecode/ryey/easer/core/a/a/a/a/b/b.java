public class ryey.easer.core.a.a.a.a.b.b implements ryey.easer.core.a.a.a.i<ryey.easer.core.a.c> {
  public ryey.easer.core.a.a.a.a.b.b();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #57                 // class ryey/easer/core/a/c
       5: invokevirtual #60                 // Method a:(Lryey/easer/core/a/c;)Ljava/lang/String;
       8: areturn

  public java.lang.String a(ryey.easer.core.a.c);
    Code:
       0: new           #16                 // class org/json/JSONObject
       3: dup
       4: invokespecial #17                 // Method org/json/JSONObject."<init>":()V
       7: astore_2
       8: aload_2
       9: ldc           #64                 // String name
      11: aload_1
      12: invokevirtual #65                 // Method ryey/easer/core/a/c.a:()Ljava/lang/String;
      15: invokevirtual #42                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      18: pop
      19: aload_2
      20: ldc           #67                 // String version
      22: bipush        11
      24: invokevirtual #70                 // Method org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
      27: pop
      28: aload_2
      29: ldc           #72                 // String situation
      31: aload_1
      32: invokevirtual #76                 // Method ryey/easer/core/a/c.c:()Lryey/easer/commons/local_plugin/eventplugin/EventData;
      35: invokestatic  #78                 // Method a:(Lryey/easer/commons/local_plugin/eventplugin/EventData;)Lorg/json/JSONObject;
      38: invokevirtual #42                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      41: pop
      42: aload_2
      43: invokevirtual #81                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      46: astore_1
      47: aload_1
      48: areturn
      49: astore_1
      50: new           #83                 // class ryey/easer/core/a/a/a/j
      53: dup
      54: aload_1
      55: invokevirtual #86                 // Method org/json/JSONException.getMessage:()Ljava/lang/String;
      58: invokespecial #89                 // Method ryey/easer/core/a/a/a/j."<init>":(Ljava/lang/String;)V
      61: athrow
    Exception table:
       from    to  target type
           0    47    49   Class org/json/JSONException
}
