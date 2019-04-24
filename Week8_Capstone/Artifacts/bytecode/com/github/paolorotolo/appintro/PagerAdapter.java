public class com.github.paolorotolo.appintro.PagerAdapter extends android.support.v4.app.r {
  public com.github.paolorotolo.appintro.PagerAdapter(android.support.v4.app.n, java.util.List<android.support.v4.app.i>);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #15                 // Method android/support/v4/app/r."<init>":(Landroid/support/v4/app/n;)V
       5: aload_0
       6: aload_2
       7: putfield      #17                 // Field fragments:Ljava/util/List;
      10: aload_0
      11: new           #19                 // class java/util/HashMap
      14: dup
      15: invokespecial #22                 // Method java/util/HashMap."<init>":()V
      18: putfield      #24                 // Field retainedFragments:Ljava/util/Map;
      21: return

  public void destroyItem(android.view.ViewGroup, int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #24                 // Field retainedFragments:Ljava/util/Map;
       4: iload_2
       5: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       8: invokeinterface #41,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      13: ifeq          30
      16: aload_0
      17: getfield      #24                 // Field retainedFragments:Ljava/util/Map;
      20: iload_2
      21: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      24: invokeinterface #45,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
      29: pop
      30: aload_0
      31: aload_1
      32: iload_2
      33: aload_3
      34: invokespecial #47                 // Method android/support/v4/app/r.destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V
      37: return

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #17                 // Field fragments:Ljava/util/List;
       4: invokeinterface #54,  1           // InterfaceMethod java/util/List.size:()I
       9: ireturn

  public java.util.List<android.support.v4.app.i> getFragments();
    Code:
       0: aload_0
       1: getfield      #17                 // Field fragments:Ljava/util/List;
       4: areturn

  public android.support.v4.app.i getItem(int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field fragments:Ljava/util/List;
       4: invokeinterface #63,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       9: ifne          61
      12: aload_0
      13: getfield      #24                 // Field retainedFragments:Ljava/util/Map;
      16: iload_1
      17: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      20: invokeinterface #41,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      25: ifeq          47
      28: aload_0
      29: getfield      #24                 // Field retainedFragments:Ljava/util/Map;
      32: iload_1
      33: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      36: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      41: astore_2
      42: aload_2
      43: checkcast     #68                 // class android/support/v4/app/i
      46: areturn
      47: aload_0
      48: getfield      #17                 // Field fragments:Ljava/util/List;
      51: iload_1
      52: invokeinterface #71,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      57: astore_2
      58: goto          42
      61: aconst_null
      62: areturn

  public java.util.Collection<android.support.v4.app.i> getRetainedFragments();
    Code:
       0: aload_0
       1: getfield      #24                 // Field retainedFragments:Ljava/util/Map;
       4: invokeinterface #76,  1           // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       9: areturn

  public java.lang.Object instantiateItem(android.view.ViewGroup, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #81                 // Method android/support/v4/app/r.instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;
       6: checkcast     #68                 // class android/support/v4/app/i
       9: astore_1
      10: aload_0
      11: getfield      #24                 // Field retainedFragments:Ljava/util/Map;
      14: iload_2
      15: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      18: aload_1
      19: invokeinterface #85,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      24: pop
      25: aload_1
      26: areturn
}
