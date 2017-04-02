package homework11;

public enum Activity {
    LECTURES {
        @Override
        public String toString() {
            return "Лекции";
        }
    },
    EXERCISES {
        @Override
        public String toString() {
            return "Упражнения";
        }
    },
    BREAK {
        @Override
        public String toString() {
            return "Перерыв";
        }
    },
    LUNCH_BREAK {
        @Override
        public String toString() {
            return "Обеденный перерыв";
        }
    },
    SOLUTIONS {
        @Override
        public String toString() {
            return "Решения";
        }
    };
}
