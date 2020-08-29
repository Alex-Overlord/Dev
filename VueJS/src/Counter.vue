<template>
  <div class="counter">
    {{ count }}
    <div class="counter_button" @click="increment">+</div>
  </div>
</template>

<script>
  import store from './store/NotificationsStore'
  export default {
    data() {
      return {
        state: store.state
      }
    },
    computed: {
      count: function () { return this.state.count }
    },
    methods: {
      increment() {
        store.increment()
      }
    }
  }
</script>

<style src="./counter.css"></style>
