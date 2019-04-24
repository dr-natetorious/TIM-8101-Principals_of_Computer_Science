class android.arch.lifecycle.a$a {
  final java.util.Map<android.arch.lifecycle.c$a, java.util.List<android.arch.lifecycle.a$b>> a;

  final java.util.Map<android.arch.lifecycle.a$b, android.arch.lifecycle.c$a> b;

  android.arch.lifecycle.a$a(java.util.Map<android.arch.lifecycle.a$b, android.arch.lifecycle.c$a>);
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #18                 // Field b:Ljava/util/Map;
       9: aload_0
      10: new           #20                 // class java/util/HashMap
      13: dup
      14: invokespecial #21                 // Method java/util/HashMap."<init>":()V
      17: putfield      #23                 // Field a:Ljava/util/Map;
      20: aload_1
      21: invokeinterface #29,  1           // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
      26: invokeinterface #35,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      31: astore_3
      32: aload_3
      33: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      38: ifeq          123
      41: aload_3
      42: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      47: checkcast     #47                 // class java/util/Map$Entry
      50: astore        4
      52: aload         4
      54: invokeinterface #50,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      59: checkcast     #52                 // class android/arch/lifecycle/c$a
      62: astore        5
      64: aload_0
      65: getfield      #23                 // Field a:Ljava/util/Map;
      68: aload         5
      70: invokeinterface #56,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      75: checkcast     #58                 // class java/util/List
      78: astore_2
      79: aload_2
      80: astore_1
      81: aload_2
      82: ifnonnull     106
      85: new           #60                 // class java/util/ArrayList
      88: dup
      89: invokespecial #61                 // Method java/util/ArrayList."<init>":()V
      92: astore_1
      93: aload_0
      94: getfield      #23                 // Field a:Ljava/util/Map;
      97: aload         5
      99: aload_1
     100: invokeinterface #65,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     105: pop
     106: aload_1
     107: aload         4
     109: invokeinterface #68,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
     114: invokeinterface #72,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     119: pop
     120: goto          32
     123: return

  void a(android.arch.lifecycle.e, android.arch.lifecycle.c$a, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Ljava/util/Map;
       4: aload_2
       5: invokeinterface #56,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      10: checkcast     #58                 // class java/util/List
      13: aload_1
      14: aload_2
      15: aload_3
      16: invokestatic  #91                 // Method a:(Ljava/util/List;Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/c$a;Ljava/lang/Object;)V
      19: aload_0
      20: getfield      #23                 // Field a:Ljava/util/Map;
      23: getstatic     #95                 // Field android/arch/lifecycle/c$a.ON_ANY:Landroid/arch/lifecycle/c$a;
      26: invokeinterface #56,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      31: checkcast     #58                 // class java/util/List
      34: aload_1
      35: aload_2
      36: aload_3
      37: invokestatic  #91                 // Method a:(Ljava/util/List;Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/c$a;Ljava/lang/Object;)V
      40: return
}
