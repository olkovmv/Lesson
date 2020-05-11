Добавить аннотацию Validate(min = , max = , required = ),
которую можно использовать для аргументов методов, полей классов

Set<Class> classes = new HashSet<>();
classes.add(Cat.class);
classes.add(Mouse.class);
classes.add(Owner.class);
classes.add(AnimalsConfig.class);

DIContainer container = инизиализация DIContainer с передачей classes
container.getObj("Cat").catchMouse(container.getObj("Mouse"));


