final class com.github.paolorotolo.appintro.ViewPageTransformer$TransformType extends java.lang.Enum<com.github.paolorotolo.appintro.ViewPageTransformer$TransformType> {
  public static final com.github.paolorotolo.appintro.ViewPageTransformer$TransformType DEPTH;

  public static final com.github.paolorotolo.appintro.ViewPageTransformer$TransformType FADE;

  public static final com.github.paolorotolo.appintro.ViewPageTransformer$TransformType FLOW;

  public static final com.github.paolorotolo.appintro.ViewPageTransformer$TransformType SLIDE_OVER;

  public static final com.github.paolorotolo.appintro.ViewPageTransformer$TransformType ZOOM;

  static {};
    Code:
       0: new           #2                  // class com/github/paolorotolo/appintro/ViewPageTransformer$TransformType
       3: dup
       4: ldc           #19                 // String FLOW
       6: iconst_0
       7: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #25                 // Field FLOW:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      13: new           #2                  // class com/github/paolorotolo/appintro/ViewPageTransformer$TransformType
      16: dup
      17: ldc           #26                 // String DEPTH
      19: iconst_1
      20: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #28                 // Field DEPTH:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      26: new           #2                  // class com/github/paolorotolo/appintro/ViewPageTransformer$TransformType
      29: dup
      30: ldc           #29                 // String ZOOM
      32: iconst_2
      33: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #31                 // Field ZOOM:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      39: new           #2                  // class com/github/paolorotolo/appintro/ViewPageTransformer$TransformType
      42: dup
      43: ldc           #32                 // String SLIDE_OVER
      45: iconst_3
      46: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      49: putstatic     #34                 // Field SLIDE_OVER:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      52: new           #2                  // class com/github/paolorotolo/appintro/ViewPageTransformer$TransformType
      55: dup
      56: ldc           #35                 // String FADE
      58: iconst_4
      59: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      62: putstatic     #37                 // Field FADE:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      65: iconst_5
      66: anewarray     #2                  // class com/github/paolorotolo/appintro/ViewPageTransformer$TransformType
      69: dup
      70: iconst_0
      71: getstatic     #25                 // Field FLOW:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      74: aastore
      75: dup
      76: iconst_1
      77: getstatic     #28                 // Field DEPTH:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      80: aastore
      81: dup
      82: iconst_2
      83: getstatic     #31                 // Field ZOOM:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      86: aastore
      87: dup
      88: iconst_3
      89: getstatic     #34                 // Field SLIDE_OVER:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      92: aastore
      93: dup
      94: iconst_4
      95: getstatic     #37                 // Field FADE:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
      98: aastore
      99: putstatic     #39                 // Field $VALUES:[Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
     102: return

  public static com.github.paolorotolo.appintro.ViewPageTransformer$TransformType valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class com/github/paolorotolo/appintro/ViewPageTransformer$TransformType
       2: aload_0
       3: invokestatic  #47                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class com/github/paolorotolo/appintro/ViewPageTransformer$TransformType
       9: areturn

  public static com.github.paolorotolo.appintro.ViewPageTransformer$TransformType[] values();
    Code:
       0: getstatic     #39                 // Field $VALUES:[Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
       3: invokevirtual #54                 // Method "[Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;".clone:()Ljava/lang/Object;
       6: checkcast     #50                 // class "[Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;"
       9: areturn
}
