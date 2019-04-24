class ryey.easer.core.a.a.a.a.c.b implements ryey.easer.core.a.a.a.f<ryey.easer.core.a.g> {
  ryey.easer.core.a.g a;

  ryey.easer.core.a.a.a.a.c.b();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.Object a(java.io.InputStream);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #100                // Method b:(Ljava/io/InputStream;)Lryey/easer/core/a/g;
       5: areturn

  public ryey.easer.core.a.g b(java.io.InputStream);
    Code:
       0: new           #29                 // class org/json/JSONObject
       3: dup
       4: aload_1
       5: invokestatic  #107                // Method ryey/easer/core/a/a/a/e.a:(Ljava/io/InputStream;)Ljava/lang/String;
       8: invokespecial #108                // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      11: astore_1
      12: aload_1
      13: ldc           #110                // String version
      15: iconst_2
      16: invokevirtual #114                // Method org/json/JSONObject.optInt:(Ljava/lang/String;I)I
      19: istore_2
      20: aload_0
      21: new           #85                 // class ryey/easer/core/a/g
      24: dup
      25: iload_2
      26: invokespecial #117                // Method ryey/easer/core/a/g."<init>":(I)V
      29: putfield      #80                 // Field a:Lryey/easer/core/a/g;
      32: aload_0
      33: getfield      #80                 // Field a:Lryey/easer/core/a/g;
      36: aload_1
      37: ldc           #119                // String name
      39: invokevirtual #33                 // Method org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
      42: invokevirtual #121                // Method ryey/easer/core/a/g.a:(Ljava/lang/String;)V
      45: aload_0
      46: aload_1
      47: ldc           #123                // String operation
      49: invokevirtual #127                // Method org/json/JSONObject.optJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
      52: iload_2
      53: invokespecial #129                // Method a:(Lorg/json/JSONArray;I)V
      56: aload_0
      57: getfield      #80                 // Field a:Lryey/easer/core/a/g;
      60: astore_1
      61: aload_1
      62: areturn
      63: astore_1
      64: new           #40                 // class ryey/easer/commons/local_plugin/b
      67: dup
      68: aload_1
      69: invokespecial #132                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      72: athrow
    Exception table:
       from    to  target type
           0    61    63   Class org/json/JSONException
}
