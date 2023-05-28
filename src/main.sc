require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /hello 
        a: Привет привет

    state: Weather 
        intent!: /weather 
        a: Пока пока
        
    state: Currency  
        intent!: /currency  
        a: Пока пока


    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}