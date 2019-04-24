class ryey.easer.core.ConditionHolderService$a extends android.os.Binder {
  final ryey.easer.core.ConditionHolderService a;

  ryey.easer.core.ConditionHolderService$a(ryey.easer.core.ConditionHolderService);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/core/ConditionHolderService;
       5: aload_0
       6: invokespecial #15                 // Method android/os/Binder."<init>":()V
       9: return

  java.lang.Boolean a(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lryey/easer/core/ConditionHolderService;
       4: invokestatic  #21                 // Method ryey/easer/core/ConditionHolderService.b:(Lryey/easer/core/ConditionHolderService;)Ljava/util/Map;
       7: aload_1
       8: invokeinterface #27,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      13: checkcast     #29                 // class ryey/easer/commons/local_plugin/a/d
      16: invokeinterface #33,  1           // InterfaceMethod ryey/easer/commons/local_plugin/a/d.c:()Ljava/lang/Boolean;
      21: areturn

  void a();
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lryey/easer/core/ConditionHolderService;
       4: invokestatic  #35                 // Method ryey/easer/core/ConditionHolderService.a:(Lryey/easer/core/ConditionHolderService;)Ljava/util/Map;
       7: invokeinterface #39,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
      12: invokeinterface #45,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      17: astore_1
      18: aload_1
      19: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      24: ifeq          61
      27: aload_1
      28: invokeinterface #55,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      33: checkcast     #57                 // class java/lang/String
      36: astore_2
      37: aload_0
      38: getfield      #12                 // Field a:Lryey/easer/core/ConditionHolderService;
      41: invokestatic  #35                 // Method ryey/easer/core/ConditionHolderService.a:(Lryey/easer/core/ConditionHolderService;)Ljava/util/Map;
      44: aload_2
      45: invokeinterface #27,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      50: checkcast     #41                 // class java/util/Set
      53: invokeinterface #60,  1           // InterfaceMethod java/util/Set.clear:()V
      58: goto          18
      61: return

  void a(java.lang.String, android.net.Uri);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lryey/easer/core/ConditionHolderService;
       4: invokestatic  #35                 // Method ryey/easer/core/ConditionHolderService.a:(Lryey/easer/core/ConditionHolderService;)Ljava/util/Map;
       7: aload_1
       8: invokeinterface #27,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      13: checkcast     #41                 // class java/util/Set
      16: aload_2
      17: invokeinterface #65,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      22: pop
      23: return

  void b();
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lryey/easer/core/ConditionHolderService;
       4: invokestatic  #67                 // Method ryey/easer/core/ConditionHolderService.c:(Lryey/easer/core/ConditionHolderService;)V
       7: aload_0
       8: getfield      #12                 // Field a:Lryey/easer/core/ConditionHolderService;
      11: invokestatic  #70                 // Method ryey/easer/core/ConditionHolderService.d:(Lryey/easer/core/ConditionHolderService;)V
      14: return

  void b(java.lang.String, android.net.Uri);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Lryey/easer/core/ConditionHolderService;
       4: invokestatic  #35                 // Method ryey/easer/core/ConditionHolderService.a:(Lryey/easer/core/ConditionHolderService;)Ljava/util/Map;
       7: aload_1
       8: invokeinterface #27,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      13: checkcast     #41                 // class java/util/Set
      16: aload_2
      17: invokeinterface #73,  2           // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
      22: pop
      23: return
}
