public class ryey.easer.core.a.a.a.a.a.a implements ryey.easer.core.a.a.a.f<ryey.easer.core.a.b> {
  public ryey.easer.core.a.a.a.a.a.a();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.Object a(java.io.InputStream);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #59                 // Method b:(Ljava/io/InputStream;)Lryey/easer/core/a/b;
       5: areturn

  public ryey.easer.core.a.b b(java.io.InputStream);
    Code:
       0: new           #18                 // class org/json/JSONObject
       3: dup
       4: aload_1
       5: invokestatic  #66                 // Method ryey/easer/core/a/a/a/e.a:(Ljava/io/InputStream;)Ljava/lang/String;
       8: invokespecial #69                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      11: astore_1
      12: aload_1
      13: ldc           #71                 // String version
      15: iconst_4
      16: invokevirtual #75                 // Method org/json/JSONObject.optInt:(Ljava/lang/String;I)I
      19: istore_2
      20: new           #77                 // class ryey/easer/core/a/b
      23: dup
      24: iload_2
      25: aload_1
      26: ldc           #79                 // String name
      28: invokevirtual #22                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      31: aload_1
      32: ldc           #81                 // String condition
      34: invokevirtual #85                 // Method org/json/JSONObject.getJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
      37: iload_2
      38: invokestatic  #87                 // Method a:(Lorg/json/JSONObject;I)Lryey/easer/commons/local_plugin/a/a;
      41: invokespecial #90                 // Method ryey/easer/core/a/b."<init>":(ILjava/lang/String;Lryey/easer/commons/local_plugin/a/a;)V
      44: astore_1
      45: aload_1
      46: areturn
      47: astore_1
      48: new           #92                 // class ryey/easer/commons/local_plugin/b
      51: dup
      52: aload_1
      53: invokespecial #95                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      56: athrow
    Exception table:
       from    to  target type
           0    45    47   Class org/json/JSONException
}
