public class ryey.easer.core.a.a.a.a.c.c implements ryey.easer.core.a.a.a.i<ryey.easer.core.a.g> {
  public ryey.easer.core.a.a.a.a.c.c();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #16                 // class ryey/easer/core/a/g
       5: invokevirtual #19                 // Method a:(Lryey/easer/core/a/g;)Ljava/lang/String;
       8: areturn

  public java.lang.String a(ryey.easer.core.a.g);
    Code:
       0: new           #23                 // class org/json/JSONObject
       3: dup
       4: invokespecial #24                 // Method org/json/JSONObject."<init>":()V
       7: astore_2
       8: aload_2
       9: ldc           #26                 // String name
      11: aload_1
      12: invokevirtual #29                 // Method ryey/easer/core/a/g.a:()Ljava/lang/String;
      15: invokevirtual #33                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      18: pop
      19: aload_2
      20: ldc           #35                 // String version
      22: bipush        11
      24: invokevirtual #38                 // Method org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
      27: pop
      28: aload_2
      29: ldc           #40                 // String operation
      31: aload_0
      32: aload_1
      33: invokevirtual #44                 // Method b:(Lryey/easer/core/a/g;)Lorg/json/JSONArray;
      36: invokevirtual #33                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      39: pop
      40: aload_2
      41: invokevirtual #47                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      44: astore_1
      45: aload_1
      46: areturn
      47: astore_1
      48: new           #49                 // class ryey/easer/core/a/a/a/j
      51: dup
      52: aload_1
      53: invokevirtual #52                 // Method org/json/JSONException.getMessage:()Ljava/lang/String;
      56: invokespecial #55                 // Method ryey/easer/core/a/a/a/j."<init>":(Ljava/lang/String;)V
      59: athrow
    Exception table:
       from    to  target type
           0    45    47   Class org/json/JSONException

  org.json.JSONArray b(ryey.easer.core.a.g);
    Code:
       0: new           #57                 // class org/json/JSONArray
       3: dup
       4: invokespecial #58                 // Method org/json/JSONArray."<init>":()V
       7: astore_3
       8: aload_1
       9: invokevirtual #62                 // Method ryey/easer/core/a/g.c:()Ljava/util/Set;
      12: invokeinterface #68,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      17: astore        4
      19: aload         4
      21: invokeinterface #74,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      26: ifeq          144
      29: aload         4
      31: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      36: checkcast     #80                 // class java/lang/String
      39: astore        5
      41: aload_1
      42: aload         5
      44: invokevirtual #83                 // Method ryey/easer/core/a/g.b:(Ljava/lang/String;)Ljava/util/Collection;
      47: invokeinterface #86,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      52: astore        6
      54: aload         6
      56: invokeinterface #74,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      61: ifeq          19
      64: aload         6
      66: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      71: checkcast     #88                 // class ryey/easer/core/a/h
      74: astore_2
      75: new           #23                 // class org/json/JSONObject
      78: dup
      79: invokespecial #24                 // Method org/json/JSONObject."<init>":()V
      82: astore        7
      84: aload         7
      86: ldc           #90                 // String spec
      88: aload         5
      90: invokevirtual #33                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      93: pop
      94: aload_2
      95: invokevirtual #92                 // Method ryey/easer/core/a/h.a:()Z
      98: ifeq          112
     101: aload_2
     102: getfield      #95                 // Field ryey/easer/core/a/h.b:Lryey/easer/c/a;
     105: getfield      #100                // Field ryey/easer/c/a.c:Ljava/lang/String;
     108: astore_2
     109: goto          125
     112: aload_2
     113: getfield      #103                // Field ryey/easer/core/a/h.a:Lryey/easer/commons/local_plugin/c/b;
     116: getstatic     #108                // Field ryey/easer/b/a.a:Lryey/easer/b/a;
     119: invokeinterface #113,  2          // InterfaceMethod ryey/easer/commons/local_plugin/c/b.a:(Lryey/easer/b/a;)Ljava/lang/String;
     124: astore_2
     125: aload         7
     127: ldc           #115                // String data
     129: aload_2
     130: invokevirtual #33                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
     133: pop
     134: aload_3
     135: aload         7
     137: invokevirtual #118                // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
     140: pop
     141: goto          54
     144: aload_3
     145: areturn
}
