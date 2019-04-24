public class ryey.easer.core.a.a.a.a.b.a implements ryey.easer.core.a.a.a.f<ryey.easer.core.a.c> {
  public ryey.easer.core.a.a.a.a.b.a();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.Object a(java.io.InputStream);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #18                 // Method b:(Ljava/io/InputStream;)Lryey/easer/core/a/c;
       5: areturn

  public ryey.easer.core.a.c b(java.io.InputStream);
    Code:
       0: new           #22                 // class org/json/JSONObject
       3: dup
       4: aload_1
       5: invokestatic  #27                 // Method ryey/easer/core/a/a/a/e.a:(Ljava/io/InputStream;)Ljava/lang/String;
       8: invokespecial #30                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      11: astore_3
      12: aload_3
      13: ldc           #32                 // String version
      15: iconst_4
      16: invokevirtual #36                 // Method org/json/JSONObject.optInt:(Ljava/lang/String;I)I
      19: istore_2
      20: aload_3
      21: ldc           #38                 // String name
      23: invokevirtual #42                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      26: astore_1
      27: aload_3
      28: ldc           #44                 // String situation
      30: invokevirtual #48                 // Method org/json/JSONObject.getJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
      33: astore_3
      34: aload_3
      35: ldc           #50                 // String spec
      37: invokevirtual #42                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      40: astore        4
      42: new           #52                 // class ryey/easer/core/a/c
      45: dup
      46: iload_2
      47: aload_1
      48: invokestatic  #57                 // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
      51: invokevirtual #60                 // Method ryey/easer/plugins/b.b:()Lryey/easer/plugins/b$c;
      54: aload         4
      56: invokevirtual #65                 // Method ryey/easer/plugins/b$c.b:(Ljava/lang/String;)Lryey/easer/commons/local_plugin/d;
      59: checkcast     #67                 // class ryey/easer/commons/local_plugin/eventplugin/b
      62: invokeinterface #71,  1           // InterfaceMethod ryey/easer/commons/local_plugin/eventplugin/b.e:()Lryey/easer/commons/local_plugin/eventplugin/a;
      67: aload_3
      68: ldc           #73                 // String data
      70: invokevirtual #42                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      73: getstatic     #78                 // Field ryey/easer/b/a.a:Lryey/easer/b/a;
      76: iload_2
      77: invokeinterface #83,  4           // InterfaceMethod ryey/easer/commons/local_plugin/eventplugin/a.a:(Ljava/lang/String;Lryey/easer/b/a;I)Lryey/easer/commons/local_plugin/eventplugin/EventData;
      82: invokespecial #86                 // Method ryey/easer/core/a/c."<init>":(ILjava/lang/String;Lryey/easer/commons/local_plugin/eventplugin/EventData;)V
      85: astore_1
      86: aload_1
      87: areturn
      88: astore_1
      89: new           #88                 // class ryey/easer/commons/local_plugin/b
      92: dup
      93: aload_1
      94: invokespecial #91                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      97: athrow
    Exception table:
       from    to  target type
           0    86    88   Class org/json/JSONException
}
